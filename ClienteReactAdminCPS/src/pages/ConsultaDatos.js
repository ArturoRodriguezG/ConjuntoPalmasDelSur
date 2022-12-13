import axios from 'axios';
import { useEffect, useState } from 'react';
import {Row, Container, Button} from 'react-bootstrap';
import Form from 'react-bootstrap/Form';
import { useNavigate } from 'react-router-dom';
import {CONSUL_GET_ENDPOINT} from "../connections/endpoints"

const ConsultaDatos= ()=>{
    const navegar= useNavigate()
    const accionbtn= ()=>{
        return navegar("/bienvenida")
    }
    
    const [dresidente, setDresidente]= useState([])

    useEffect(()=>{

        axios.get(CONSUL_GET_ENDPOINT)
        .then(respuesta=>{
            setDresidente(respuesta.data)
        })
        .catch(err=>{
            console.error(err)
        })
    
    },[])

    return(
    <Container className= "mt-3 mb-3">
        <Form onSubmit= {accionbtn}>
            <Row classname= "justify-content-md-center">
                <h3>CONSULTA DE DATOS</h3>
                <br></br>
                <>
                <div> 
                <br></br>
                <Form.Group className="col-lg-4">
                    <Form.Label classname="mt-10" >Código: </Form.Label>
                    <Form.Control placeholder= {dresidente.codigo} disabled />
                </Form.Group>
                <br></br>
                <Form.Group className="mb-3" class= "col col-sm-8 col-md-8 col-lg-6">
                    <Form.Label>Nombre: </Form.Label>
                    <Form.Control placeholder={dresidente.nombre} disabled />
                </Form.Group>
                <br></br>
                <Form.Group className="mb-3" class= "col col-sm-8 col-md-8 col-lg-6">
                    <Form.Label>Email:</Form.Label>
                    <Form.Control placeholder={dresidente.correo} disabled />
                </Form.Group>
                <br></br>
                <Form.Group className="mb-3" class= "col col-sm-8 col-md-8 col-lg-4">
                    <Form.Label>Teléfono No. 1: </Form.Label>
                    <Form.Control placeholder={dresidente.telefono1} disabled />
                </Form.Group>
                <br></br>
                <Form.Group className="mb-3" class= "col col-sm-8 col-md-8 col-lg-4">
                    <Form.Label>Teléfono No 2: </Form.Label>
                    <Form.Control placeholder={dresidente.telefono2} disabled />
                </Form.Group>
                <br></br>
                </div>
                </>
            </Row>
            <div className="mb-2">
                <Button variant="primary" type="submit" size="lg" className="mt-10" class="btn-check">
                    Salir
                </Button>    
            </div>
        </Form>
    </Container>
  )
}

export {ConsultaDatos}
