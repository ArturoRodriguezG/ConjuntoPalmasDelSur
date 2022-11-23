import Container from 'react-bootstrap/Container';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';
import NavDropdown from 'react-bootstrap/NavDropdown';

function Navegacion() {
  return (
    <Navbar bg="light" expand="lg">
      <Container>
        <Navbar.Brand href="#bienvenida">Bienvenida</Navbar.Brand>
        <Navbar.Toggle aria-controls="basic-navbar-nav" />
        <Navbar.Collapse id="basic-navbar-nav">
          <Nav className="me-auto">
            <NavDropdown title="Inicio Sesion" id="basic-nav-dropdown">
              <NavDropdown.Item href="#iniciaResi">Residente</NavDropdown.Item>
              <NavDropdown.Item href="#iniciaAdmin">Administrador</NavDropdown.Item>
              </NavDropdown>

            <Nav.Link href="#consultaDatos">Consulta Datos</Nav.Link>
            <Nav.Link href="#actualizarDatos">Actualiza Datos</Nav.Link>
            <Nav.Link href="#actualizarTarifas">Actualiza Tarifa</Nav.Link>
            <Nav.Link href="#generarFactura">Generar Factura</Nav.Link>
            <Nav.Link href="#registrarPago">Registrar Pago</Nav.Link>
            <Nav.Link href="#generarExtracto">Generar Extracto</Nav.Link>
            <Nav.Link href="#reporteCartera">Reporte Cartera</Nav.Link>

              
          </Nav>
        </Navbar.Collapse>
      </Container>
    </Navbar>
  );
}

export { Navegacion };