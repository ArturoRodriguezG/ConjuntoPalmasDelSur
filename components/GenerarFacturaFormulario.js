const GenerarFacturaFormulario= ()=> 
    ` 
    <form>
    <center><div class=”fs-a fw-bold text-danger”>
        <h3>-Conjunto Residencial de PH - Palmas Del Sur -</h3>
    </div></center>
    <div>
    <center>
        <blockquote>
            <h5>Nit 900.800.700.0 </h5>
            <h5>Diagonal 65 #113-05 Sur</h5>
        </blockquote>
        </center>
    </div>

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
        
        <thead>
          <tr>
            <th scope="col">Concepto</th>
            <th scope="col">Saldo a Octubre</th>
            <th scope="col">Cuota de Noviembre</th>
            <th scope="col">Nuevo Saldo</th>
          </tr>
        </thead>
        <tbody>
            <tr>
                <th scope="row">Pago Anterior</th>
                <td>$210.000</td>
                <td>$0</td>
                <td>$50.000</td>
              </tr>
    
            <tr>
            <th scope="row">Facturación Administración</th>
            <td>$0</td>
            <td>$260.000</td>
            <td>$260.000</td>
          </tr>
          <tr>
            <th scope="row">Saldo Final</th>
            <td></td>
            <td></td>
            <td>$310.000</td>
          </tr>
        </tbody>
      </table>
      <input type="submit" class="btn-check" id="btn-check" autocomplete="off">
      <label class="btn btn-primary" for="btn-check"> Salir </label>
    </form>
    `
export {GenerarFacturaFormulario}
