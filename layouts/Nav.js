
const Nav= ()=>{
   const cadena= ` 
    <nav class="navbar navbar-expand-lg bg-light">
      <div class="container-fluid">
        <a class="navbar-brand" href="">Conjunto Residencial de PH - Palmas Del Sur - </a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div></div>
        <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
          <div class="navbar-nav">
            <a class="nav-link active" aria-current="page" href="/">Inicio</a>
            <a class="nav-link" href="#/inicioSesion/">Inicio Sesión</a>
            <a class="nav-link" href="#/consultaDatos/">Consulta Datos</a>
            <a class="nav-link" href="#/actualizarDatos/">Actualizar Datos</a>
            <a class="nav-link" href="#/actualizarTarifas/">Actualizar Tarifas</a>
            <a class="nav-link" href="#/generarFactura/">Generar Factura</a>
            <a class="nav-link" href="#/registrarPago/">Registrar pago</a>
            <a class="nav-link" href="#/generarExtracto/">Generar Extracto</a>
            <a class="nav-link" href="#/reporteCartera/">Reporte Cartera</a>
          </div>
        </div>
      </div>
    </nav>
    `
    return cadena}
export {Nav}