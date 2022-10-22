const ReporteCartera= ()=> 
    ` 
    <center><div class=”fs-a fw-bold text-danger”>
        <h3>- Reporte de Cartera Administrativo -</h3>
    </div></center>
    <table class="table caption-top">
        <div class="wrapper">
            <div class="box a">Mes Facturación: </div>
            <div class="box a">Octubre/2022</div>
        </div>
        
      </table>
      <table class="table table-striped">
        <thead>
          <tr>
            <th scope="col">Apartamento</th>
            <th scope="col">Residente</th>
            <th scope="col">Teléfonos</th>
            <th scope="col"  align="right">Saldo a la Fecha</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <th scope="row">5-101</th>
            <td>Juan Perez</td>
            <td>3007654321-6012569874</td>
            <td align="right">$850.000</td>
          </tr>
          <tr>
            <th scope="row">5-102</th>
            <td>Maria Iribarne</td>
            <td>3401234567-6012233558</td>
            <td align="right">$1.550.000</td>
          </tr>
          <tr>
            <th scope="row">5-201</th>
            <td>Orlando Gonzalez</td>
            <td>3501234567-3207654321</td>
            <td align="right">$250.000</td>
          </tr>
          <tr>
            <th scope="row">5-201</th>
            <td>Mariana Aguilera</td>
            <td>3151234567-3127654321</td>
            <td align="right">$130.000</td>
          </tr>
          <tr>
            <th scope="row">TOTAL CARTERA:</th>
            <td></td>
            <td></td>
            
            <td align="right"><b>$2.780.000</b></td>
          </tr>

        </tbody>
      </table>
      <input type="checkbox" class="btn-check" id="btn-check" autocomplete="off">
      <label class="btn btn-primary" for="btn-check"> Salir </label>    
      

      `

export {ReporteCartera}