//import getAConsultaDatos from "../connections/helpers/getAConsultaDatos.js"

const ConsultaDatosFormulario= ()=>{ 
    //const datos= await getAConsultaDatos()
    return (` 
<form>
    <fieldset disabled>
        <div class="mb-3">
        <div class= "col col-sm-12 col-md-8 col-lg-8">
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
        </div>
    </fieldset>
    <input type="submit" class="btn-check" id="btn-check" autocomplete="off">
    <label class="btn btn-primary" for="btn-check"> Salir </label>
</form>
`)
}
export {ConsultaDatosFormulario}
