// import {CONSUL_POST_ENDPOINT} from "../connections/helpers/endpoints"

import {ConsultaDatosFormulario} from "../components/ConsultaDatosFormuario.js"

const ConsultaDatos= ()=>
` 
    <h3 class= "text-left"> Consulta de Datos</h3>
    <div class="container mt-3 mb-3">
        <div class= "col col-sm-12 col-md-8 col-lg-8">
            ${ConsultaDatosFormulario()}
        </div>
    </div> 
`
export {ConsultaDatos}
