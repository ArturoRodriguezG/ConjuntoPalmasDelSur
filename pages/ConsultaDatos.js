import getConsultaDatos from "../connections/helpers/getConsultaDatos"
import ConsultaDatosFormulario from "../connections/helpers/getConsultaDatos"

const ConsultaDatos= async ()=>{
    const datos= await getConsultaDatos()
    	    return (` 
    <h3 class= "text-left"> Consulta de Datos</h3>
    <div class="container mt-3 mb-3">
        <div class= "col col-sm-12 col-md-8 col-lg-8">
            ${ConsultaDatosFormulario()}
        </div>
    </div> `)}
export {ConsultaDatos}
