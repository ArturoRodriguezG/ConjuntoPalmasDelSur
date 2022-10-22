const ActualizarDatos= ()=> 
    ` 
    <form>
        <fieldset disabled></fieldset>
    <div class="mb-3 row">
        <label for="staticEmail" class="col-sm-2 col-form-label">Código: </label>
        <input class="form-control" type="text" value="Campo_Codigo" aria-label="readonly input example">
        <label for="staticEmail" class="col-sm-2 col-form-label">Nombres: </label>
        <input class="form-control" type="text" value="Campo_Nombre" aria-label="readonly input example" readonly>
        <label for="staticEmail" class="col-sm-2 col-form-label">Apellidos: </label>
        <input class="form-control" type="text" value="Campo_Apellidos" aria-label="readonly input example" readonly>
        <label for="staticEmail" class="col-sm-2 col-form-label">Correo Electrónico: </label>
        <input class="form-control" type="text" value="Campo_Correo" aria-label="readonly input example" readonly>
        <label for="staticEmail" class="col-sm-2 col-form-label">Teléfono No. 1: </label>
        <input class="form-control" type="text" value="Campo_Telefono1" aria-label="readonly input example" readonly>
        <label for="staticEmail" class="col-sm-2 col-form-label">Teléfono No 2: </label>
        <input class="form-control" type="text" value="Campo_Telefono2" aria-label="readonly input example" readonly>
    </div>
    <input type="checkbox" class="btn-check" id="btn-check" autocomplete="off">
    <label class="btn btn-primary" for="btn-check"> Actualizar y salir </label>
</fieldset>
</form>
       `
export {ActualizarDatos}
