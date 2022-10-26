
import { GenerarFacturaFormulario } from "../components/GenerarFacturaFormulario.js"

const GenerarFactura= ()=> 
    ` 
    <h3 class= "text-left"> Generar Facturación</h3>
    <div class="container mt-3 mb-3">
    <div class= "col col-sm-12 col-md-8 col-lg-8">
        ${GenerarFacturaFormulario()}
    </div>
</div>

    `
export {GenerarFactura}
