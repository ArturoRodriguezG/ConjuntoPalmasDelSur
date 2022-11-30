import {ActualizarTarifasFormulario} from "../components/ActualizarTarifasFormulario.js"
const ActualizarTarifas= ()=> 
    ` 
    <h3 class= "text-left"> - ACTUALIZA TARIFAS DE ADMINISTRACIÓN - </h3>
    <div class="container mt-3 mb-3">
        <div class= "col col-sm-12 col-md-8 col-lg-8">

        <form>
        <div class="input-group mb-3">
        <span class="input-group-text">Tarifa Admninistración Básica $</span>
        <input type="text" class="form-control" aria-label="">
        </div>    
        <div class="input-group mb-3">
        <span class="input-group-text">Tarifa Admninistración Servicios $</span>
        <input type="text" class="form-control" aria-label="">
        </div>
        <input type="submit" class="btn-check" id="btn-check" autocomplete="off">
        <label class="btn btn-primary" for="btn-check"> Actualizar y salir </label>
        </form>
        </div>
    </div>
        `
export {ActualizarTarifas}
