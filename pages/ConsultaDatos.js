const ConsultaDatos= ()=> 
    ` 
<form>
    <fieldset disabled>
        <div class="mb-3">
            <label for="disabledTextInput" class="form-label"> Código: </label>
            <input type="text" id="disabledTextInput" class="form-control" placeholder="Campo_Codigo">
            <label for="disabledTextInput" class="form-label"> Nombres: </label>
            <input type="text" id="disabledTextInput" class="form-control" placeholder="Campo_Nombre">
            <label for="disabledTextInput" class="form-label"> Apellidos: </label>
            <input type="text" id="disabledTextInput" class="form-control" placeholder="Campo_Apellidos">
            <label for="disabledTextInput" class="form-label"> Correo Electrónico: </label>
            <input type="text" id="disabledTextInput" class="form-control" placeholder="Campo_Correo">
            <label for="disabledTextInput" class="form-label"> Teléfono No. 1: </label>
            <input type="text" id="disabledTextInput" class="form-control" placeholder="Campo_Telefono1">
            <label for="disabledTextInput" class="form-label"> Teléfono No. 2: </label>
            <input type="text" id="disabledTextInput" class="form-control" placeholder="Campo_Telefono2">
    
        </div>
    </fieldset>
    <input type="checkbox" class="btn-check" id="btn-check" autocomplete="off">
    <label class="btn btn-primary" for="btn-check"> Salir </label>

</form>
`

export {ConsultaDatos}
