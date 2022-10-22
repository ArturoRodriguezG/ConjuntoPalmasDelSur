
const Nav= ()=>{
   const cadena= `
   <div><h2>Conjunto Residencial de PH - Palmas Del Sur - </h2></div>
    <nav class="navbar navbar-expand-lg bg-light">
      
        <div class="container-fluid"  style="background-color:#79a7c8;">
        <a class="navbar-brand" href="#/bienvenida/"></a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div></div>
        
        <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
          
          <div class="navbar-nav">
            
            <a class="nav-link active" href="#/bienvenida/">Bienvenida</a>
            <a class="nav-link active" href="#/inicioSesion/">Inicio Sesión</a>
            <a class="nav-link active" href="#/consultaDatos/">Consulta Datos</a>
            <a class="nav-link active" href="#/actualizarDatos/">Actualizar Datos</a>
            <a class="nav-link active" href="#/actualizarTarifas/">Actualizar Tarifas</a>
            <a class="nav-link active" href="#/generarFactura/">Generar Factura</a>
            <a class="nav-link active" href="#/registrarPago/">Registrar pago</a>
            <a class="nav-link active" href="#/generarExtracto/">Generar Extracto</a>
            <a class="nav-link active" href="#/reporteCartera/">Reporte Cartera</a>
          </div>
        </div>
      </div>
    </nav>
    `
    return cadena}
export {Nav}