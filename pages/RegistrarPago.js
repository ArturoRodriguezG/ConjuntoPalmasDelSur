const RegistrarPago= ()=> 
    ` 
<center><div class=”fs-a fw-bold text-danger”>
    <h3>- Registrar Pago -</h3>
</div></center>

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
<form>
    <fieldset>
    <div class="mb-3 row">
        <label for="staticEmail" class="col-sm-2 col-form-label">Código: </label>
        <input class="form-control" type="text" value="Campo_Codigo" aria-label="readonly input example" disabled>
        <label for="staticEmail" class="col-sm-2 col-form-label">Descripción: </label>
        <input class="form-control" type="text" value="Campo_Descripcion" aria-label="readonly input example" disabled>
        <label for="staticEmail" class="col-sm-2 col-form-label">Valor Tarifa: </label>
        <input class="form-control" type="text" value="Campo_VlrTarifa" aria-label="readonly input example" disabled>
        <label for="staticEmail" class="col-sm-2 col-form-label">Saldo a la fecha: </label>
        <input class="form-control" type="text" value="Campo_CalculoSaldo" disabled>
        <label for="staticEmail" class="col-sm-2 col-form-label">Fecha de Pago: </label>
        <input class="form-control" type="text" value="Fecha_Sistema" aria-label="readonly input example" disabled>
        <label for="staticEmail" class="col-sm-2 col-form-label">Valor a Pagar: </label>
        <input class="form-control" type="text" value="Campo_Capturado" aria-label="readonly input example">
    </div>
</fieldset>
</form>
<input type="checkbox" class="btn-check" id="btn-check" autocomplete="off">
<label class="btn btn-primary" for="btn-check"> Actualizar y salir </label>

    `
export {RegistrarPago}