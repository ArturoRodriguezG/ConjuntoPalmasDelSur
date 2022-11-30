import {GenerarExtractoFormulario} from "../components/GenerarExtractoFormulario.js"
const GenerarExtracto= ()=>
    ` 
   <h3 class= "text-left">- Extracto Estado de Cuenta -</h3>
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
            
            <thead>
              <tr>
                <th scope="col">Concepto</th>
                <th scope="col">Saldo a Octubre</th>
                <th scope="col">Factura del Mes</th>
                <th scope="col">Pago del Mes</th>
                <th scope="col">Nuevo Saldo</th>
              </tr>
            </thead>
            <tbody>
                <tr>
                    <th scope="row">Saldo a Octubre</th>
                    <td>$210.000</td>
                    <td>$260.000</td>
                    <td>$300.000</td>
                    <td>$170.000</td>
                  </tr>
            </tbody>
          </table>
          <input type="submit" class="btn-check" id="btn-check" autocomplete="off">
          <label class="btn btn-primary" for="btn-check"> Salir </label>
        </form>
    
        </div>
    </div>
    
    `
export {GenerarExtracto}