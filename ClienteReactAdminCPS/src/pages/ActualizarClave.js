import {ActualizarClaveFormulario} from "../components/ActualizarClaveFormulario.js"
const ActualizarClave= ()=> 
    ` 
    <h3 class= "text-left"> Axctualiza Clave de Acceso</h3>
    <div class="container mt-3 mb-3">
        <div class= "col col-sm-12 col-md-8 col-lg-8">

        <form>
        <div class="mb-3">
            <label for="exampleInputPassword1" class="form-label">Nueva Contraseña</label>
            <input type="password" class="form-control" id="exampleInputPassword1">
        </div>
        <div class="mb-3">
            <label for="exampleInputPassword1" class="form-label">Confirme Nueva Contraseña</label>
            <input type="password" class="form-control" id="exampleInputPassword1">
        </div>
        <button type="submit" class="btn btn-primary">Actualizar y salir</button>
        </form>
        
        </div>
    </div>
    `
export {ActualizarClave}
