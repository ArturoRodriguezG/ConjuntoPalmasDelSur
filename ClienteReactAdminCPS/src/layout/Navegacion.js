import Container from 'react-bootstrap/Container';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';
import NavDropdown from 'react-bootstrap/NavDropdown';
import { NavLink } from 'react-router-dom';

function Navegacion() {
  return (
    <Navbar bg="primary" variant="dark" >
      <Container>
        <Navbar.Brand as={NavLink} to={"/bienvenida"}>Bienvenida</Navbar.Brand>
        <Navbar.Toggle aria-controls="basic-navbar-nav" />
        <Navbar.Collapse id="basic-navbar-nav">
          <Nav className="me-auto">
            <NavDropdown title="Inicio Sesion" id="basic-nav-dropdown" className="super-colors" >
              <NavDropdown.Item as={NavLink} to={"/iniciaResi"}>Residente</NavDropdown.Item>
              <NavDropdown.Item as={NavLink} to={"/iniciaAdmin"}>Administrador</NavDropdown.Item>
              </NavDropdown>

            <Nav.Link as={NavLink} to={"/consultaDatos"}>Consulta Datos</Nav.Link>
            <Nav.Link as={NavLink} to={"/actualizarDatos"}>Actualiza Datos</Nav.Link>
            <Nav.Link as={NavLink} to={"/actualizarTarifas"}>Actualiza Tarifa</Nav.Link>
            <Nav.Link as={NavLink} to={"/generarFactura"}>Generar Factura</Nav.Link>
            <Nav.Link as={NavLink} to={"/registrarPago"}>Registrar Pago</Nav.Link>
            <Nav.Link as={NavLink} to={"/generarExtracto"}>Generar Extracto</Nav.Link>
            <Nav.Link as={NavLink} to={"/reporteCartera"}>Reporte Cartera</Nav.Link>
              
          </Nav>
        </Navbar.Collapse>
      </Container>
    </Navbar>
  );
}

export { Navegacion };