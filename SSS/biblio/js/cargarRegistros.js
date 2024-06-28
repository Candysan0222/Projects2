function cargarUsuarios(){
    $.ajax({
        url: 'http://localhost:9000/biblioteca/Api/biblioteca/usuario',
        method: "GET",
        headers: {
            "Content-Type": "application/json"
        }
    }).done(function (items) {
        var registros = `<option value="" disabled selected>-- Seleccione un Usuario --</option>`;
        items.forEach(function (item, index, array) {
            registros += `
                       <option value="`+item.id+`">`+item.nombre+`</option>
                        `;
        })
        $("#usuarioId").html(registros);
    })
}

function cargarLibro(){
    $.ajax({
        url: 'http://localhost:9000/biblioteca/Api/biblioteca/libros',
        method: "GET",
        headers: {
            "Content-Type": "application/json"
        }
    }).done(function (items) {
        var registros = `<option value="" disabled selected>-- Seleccione un Libro --</option>`;
        items.forEach(function (item, index, array) {
            registros += `
                       <option value="`+item.id+`">`+item.titulo+`</option>
                        `;
        })
        $("#libroId").html(registros);
    })
}

function cargarPrestamo(){
    $.ajax({
        url: 'http://localhost:9000/biblioteca/Api/biblioteca/prestamo',
        method: "GET",
        headers: {
            "Content-Type": "application/json"
        }
    }).done(function (items) {
        var registros = `<option value="" disabled selected>-- Seleccione la fecha del prestamo--</option>`;
        items.forEach(function (item, index, array) {
            registros += `
                       <option value="`+item.id+`">`+item.fechaPrestamo+` `+item.libroId.titulo+`</option>
                        `;
        })
        $("#prestamoId").html(registros);
    })
}