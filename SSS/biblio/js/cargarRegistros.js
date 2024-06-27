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