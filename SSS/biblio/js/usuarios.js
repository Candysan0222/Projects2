//Cargar de manera automatica los datos regostrados
// Busqueda por id
function findById(id) {
    $.ajax({
        url: 'http://localhost:9000/biblioteca/Api/biblioteca/usuario/' + id,
        method: "GET",
        headers: {
            "Content-Type": "application/json"
        }
    }).done(function (item) {
        $("#id").val(item.id)
        $("#nombre").val(item.nombre)
        $("#direccion").val(item.direccion)
        $("#email").val(item.correo)
        $("#tipo").val(item.tipoUsuario)
        $("#estado").val((item.estado == true) ? "1" : "0")
        
    })
}

function loadTable() {
    $.ajax({
        url: 'http://localhost:9000/biblioteca/Api/biblioteca/usuario/filtro',
        method: "GET",
        headers: {
            "Content-Type": "application/json"
        }
    }).done(function (items) {
        var registros = "";
        items.forEach(function (item, index, array) {
            registros += `
                        <tr class="table-light">
                            <td>`+ index + 1 + `</td>
                            <td>`+ item.nombre +`</td>
                            <td>`+ item.direccion + `</td>
                            <td>`+ item.correo + `</td>
                            <td>`+ item.tipoUsuario + `</td>
                            <td>`+ ((item.estado == true) ? "Activo" : "Inactivo") + `</td>
                            <td><button class="btn btn-warning" type="button" onclick="findById(`+ item.id + `);" data-bs-toggle="modal"
                            data-bs-target="#modalCliente"><i class="fi fi-rr-pencil"></i></button>
                            <button class="btn btn-danger" type="button" onclick="deleteById(`+ item.id + `);"><i class="fi fi-rr-trash"></i></button></td>
                        </tr>
                        `;
        })
        $("#dataResult").html(registros);
    })
}

//Accion para eliminar un registro seleccionado 
function deleteById(id) {
    Swal.fire({
        title: '¿Está seguro?',
        text: "¡No podrá revertir esto!",
        icon: 'warning',
        showCancelButton: true,
        confirmButtonColor: '#3085d6',
        cancelButtonColor: '#d33',
        confirmButtonText: 'Sí, eliminarlo!',
        cancelButtonText: 'Cancelar'
    }).then((result) => {
        if (result.isConfirmed) {
            $.ajax({
                url: 'http://localhost:9000/biblioteca/Api/biblioteca/usuario/' + id,
                method: "delete",
                headers: {
                    "Content-Type": "application/json"
                }
            }).done(function (result) {
                const Toast = Swal.mixin({
                    toast: true,
                    position: 'top-end',
                    showConfirmButton: false,
                    timer: 4000,
                    timerProgressBar: true,
                    didOpen: (toast) => {
                        toast.addEventListener('mouseenter', Swal.stopTimer)
                        toast.addEventListener('mouseleave', Swal.resumeTimer)
                    }
                })

                Toast.fire({
                    icon: 'success',
                    title: 'Usuario eliminado',
                });
                loadTable();
            })
        }
    })
}

//Accion de adicionar un registro
function guardar() {
    // Obtener el valor del campo de ID
    var id = $("#id").val();
    

    
    // Crear el objeto de datos a enviar
    var data = {
        nombre: $("#nombre").val(),
        direccion: $("#direccion").val(),
        correo: $("#email").val(),
        tipoUsuario: $("#tipo").val(),
        estado: ($("#estado").val() == "1") ? true : false
    };
    
    // Determinar si se debe realizar una solicitud POST o PUT
    var method = (id !== "") ? "PUT" : "POST";
    var url = (id !== "") ? "http://localhost:9000/biblioteca/Api/biblioteca/usuario/" + id : "http://localhost:9000/biblioteca/Api/biblioteca/usuario";

    // Realizar la solicitud AJAX
    $.ajax({
        url: url,
        data: JSON.stringify(data),
        method: method,
        headers: {
            "Content-Type": "application/json"
        }
    }).done(function (result) {
        //Cargar datos
        loadTable();

        //Limpiar formulario
        clearData();

        //el metodo se ejecuta y el modal se esconde o cierra
        $("modal").modal("hide");

        const Toast = Swal.mixin({
            toast: true,
            position: 'top-end',
            showConfirmButton: false,
            timer: 4000,
            timerProgressBar: true,
            didOpen: (toast) => {
                toast.addEventListener('mouseenter', Swal.stopTimer)
                toast.addEventListener('mouseleave', Swal.resumeTimer)
            }
        })

        Toast.fire({
            icon: (method === "POST") ? 'success' : 'warning',
            title: (method === "POST") ? 'Registro exitoso' : 'Modificación exitosa',
        });
    }).fail(function (jqXHR, textStatus, errorThrown) {
        // Si la respuesta es un error
        Swal.fire({
            icon: 'error',
            title: "Error",
            text: jqXHR.responseJSON.message,
        })
    });
}



// Función para limpiar datos
function clearData() {
    $("#id").val(""),
    $("#nombre").val(""),
    $("#direccion").val(""),
    $("#email").val(""),
    $("#tipo").val("")
    $("#estado").val("")
}

function limpiarFiltros(){
    $("#filtrarNombre").val(""),
    $("#filtrarCiudad").val(""),
    $("#filtrarEstado").val("")
}