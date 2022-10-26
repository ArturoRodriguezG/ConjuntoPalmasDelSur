import {ReporteCarteraFormulario} from "../components/ReporteCarteraFormulario.js"
const ReporteCartera= ()=> 
    ` 
        <h3 class= "text-left">- Reporte de Cartera Administrativo -</h3>
        <div class="container mt-3 mb-3">
            <div class= "col col-sm-12 col-md-8 col-lg-8">
                ${ReporteCarteraFormulario()}
            </div>
        </div>
      `
export {ReporteCartera}