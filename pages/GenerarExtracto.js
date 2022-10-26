import {GenerarExtractoFormulario} from "../components/GenerarExtractoFormulario.js"
const GenerarExtracto= ()=>
    ` 
   <h3 class= "text-left">- Extracto Estado de Cuenta -</h3>
    <div class="container mt-3 mb-3">
        <div class= "col col-sm-12 col-md-8 col-lg-8">
            ${GenerarExtractoFormulario()}
        </div>
    </div>
    
    `
export {GenerarExtracto}