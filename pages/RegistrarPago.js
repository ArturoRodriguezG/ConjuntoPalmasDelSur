import {RegistrarPagoFormulario} from "../components/RegistrarPagoFormulario.js"

const RegistrarPago= ()=> 
    ` 
    <h3 class= "text-left"> - Registrar Pago -</h3>
    <div class="container mt-3 mb-3">
        <div class= "col col-sm-12 col-md-8 col-lg-8">
            ${RegistrarPagoFormulario()}
        </div>
    </div>
    
    `
export {RegistrarPago}