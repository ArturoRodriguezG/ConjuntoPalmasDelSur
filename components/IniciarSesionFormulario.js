const IniciarSesionFormulario= ()=>

`
<form>
    <div class="input-group input-group-sm mb-3">
        <span class="input-group-text" id="inputGroup-sizing-sm">Usuario: </span>
        <input type="text" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-sm">
    </div>

    <div class="form-floating">
        <input type="password" class="form-control" id="floatingPassword" placeholder="Password">
        <label for="floatingPassword">Contraseña</label>
    </div>
    <br> 
    <div class="form-check">
        <input class="form-check-input" type="checkbox" value="" id="flexCheckDefault">
        <label class="form-check-label" for="flexCheckDefault"> Ingresar como Administrador </label>
    </div>
    <div>
    <button type="submit" class="btn btn-outline-primary">Autenticarme</button>
    </div>
    <a class="text-reset fw-bold" href="/index.html#/actualizarClave/">Actualizar Clave de Acceso</a>
</form>
`
export {IniciarSesionFormulario}