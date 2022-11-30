import {RegistrarPagoFormulario} from "../components/RegistrarPagoFormulario.js"

const RegistrarPago= ()=> 
    ` 
    <h3 class= "text-left"> - Registrar Pago -</h3>
    <div class="container mt-3 mb-3">
        <div class= "col col-sm-12 col-md-8 col-lg-8">

        <form>
        <table class="table caption-top">
        <div class="wrapper">
            <div class="box a">Mes Facturación: </div>
            <div class="box a">Octubre/2022</div>
            <div class="box a"></div>
            <div class="box b">Cuenta de Cobro No: </div>
            <div class="box b">011020225708</div>
            <div class="box c">Residente: </div>
            <div class="box c">Juan Perez / 3009123456</div>
            <div class="box a"></div>
            <div class="box d">Unidad Habitacional: </div>
            <div class="box d">Torre 5 Apto 708</div>
        </div>
        </table>
    
        <fieldset>
        <div class="mb-3 row">
            <label for="staticEmail" class="form-label">Código: </label>
            <input class="form-control" type="text" value="Campo_Codigo" aria-label="readonly input example" disabled>
            <label for="staticEmail" class="form-label">Descripción: </label>
            <input class="form-control" type="text" value="Campo_Descripcion" aria-label="readonly input example" disabled>
            <label for="staticEmail" class="form-label">Valor Tarifa: </label>
            <input class="form-control" type="text" value="Campo_VlrTarifa" aria-label="readonly input example" disabled>
            <label for="staticEmail" class="form-label">Saldo a la fecha: </label>
            <input class="form-control" type="text" value="Campo_CalculoSaldo" disabled>
            <label for="staticEmail" class="form-label">Fecha de Pago: </label>
            <input class="form-control" type="text" value="Fecha_Sistema" aria-label="readonly input example" disabled>
            <label for="staticEmail" class="form-label">Valor a Pagar: </label>
            <input class="form-control" type="text" value="Campo_Capturado" aria-label="readonly input example">
        </div>
        </fieldset>
        <input type="submit" class="btn-check" id="btn-check" autocomplete="off">
        <label class="btn btn-primary" for="btn-check"> Actualizar y salir </label>
    </form>
        </div>
    </div>
    
    `
export {RegistrarPago}