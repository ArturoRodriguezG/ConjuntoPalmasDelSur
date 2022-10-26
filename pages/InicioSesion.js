
import { IniciarSesionFormulario } from "../components/IniciarSesionFormulario.js"

const InicioSesion= ()=>
` 
<h3 class= "text-left"> Iniciar Sesión</h3>
<div class="container mt-3 mb-3">
    <div class= "col col-sm-12 col-md-8 col-lg-8">
        ${IniciarSesionFormulario()}
    </div>
</div>
 `
export {InicioSesion}
