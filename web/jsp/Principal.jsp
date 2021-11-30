<%-- 
    Document   : Principal
    Created on : 8/09/2021, 02:07:55 PM
    Author     : Carlos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js" integrity="sha384-W8fXfP3gkOKtndU4JGtKDvXbO53Wy8SZCQHczT5FMiiqmQfUpWbYdTil/SxwZgAN" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.min.js" integrity="sha384-skAcpIdS7UcVUC05LJ9Dxay8AXcDYfBJqt1CJ85S/CFujBsIzCIv+l9liuYLaMQ/" crossorigin="anonymous"></script>  
        <!-- Recuerden que aquí van las ligas de los css  -->
        <title>.::Bienvenido::.</title>
    </head>
    <body>

        <nav class="navbar navbar-brad navbar-expand-sm bg-dark navbar-dark">
            <a class="navbar-brad" href="#">Principal</a>
            <!-- creamos los vínculos de las otras páginas -->
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link">Empresas</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link">Empleos</a>

                </li>
                <li class="nav-item">
                    <a class="nav-link">Anuncios</a>

                </li>

            </ul>
        </nav>

        <section class=" container">
            <div class=" row ">

                <div class="col-xl-6 p-5">
                    <!-- Vamos a colocar el acordion -->
                    <div class="accordion" id="accordionExample">
                        <div class="accordion-item">
                            <h2 class="accordion-header" id="headingOne">
                                <button class="accordion-button" type="button" data-bs-toggle="collapse" data-bs-target="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
                                    Beneficios 
                                </button>
                            </h2>
                            <div id="collapseOne" class="accordion-collapse collapse show" aria-labelledby="headingOne" data-bs-parent="#accordionExample">
                                <div class="accordion-body">
                                    <strong>Apoyo a los estudiantes</strong> Es para poyarlos en conseguir ingresos extra y sin perjudicar su estudio.
                                </div>
                            </div>
                        </div>
                        <div class="accordion-item">
                            <h2 class="accordion-header" id="headingTwo">
                                <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
                                    Apoyo con los clientes
                                </button>
                            </h2>
                            <div id="collapseTwo" class="accordion-collapse collapse" aria-labelledby="headingTwo" data-bs-parent="#accordionExample">
                                <div class="accordion-body">
                                    <strong>Servicios atendidos.</strong> Va a estar sin interrumpir los servicios a los clientes.
                                </div>
                            </div>
                        </div>
                        <div class="accordion-item">
                            <h2 class="accordion-header" id="headingThree">
                                <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#collapseThree" aria-expanded="false" aria-controls="collapseThree">
                                    Desarrollo regional
                                </button>
                            </h2>
                            <div id="collapseThree" class="accordion-collapse collapse" aria-labelledby="headingThree" data-bs-parent="#accordionExample">
                                <div class="accordion-body">
                                    <strong>Culminación de estudios.</strong> Muchos jóvenes pueden finalizar su carrera con mayor oportunidad de apoyo.
                                </div>
                            </div>
                        </div>
                        <div class="accordion-item">
                            <h2 class="accordion-header" id="headingThree">
                                <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#collapseThree" aria-expanded="false" aria-controls="collapseThree">
                                    Otro
                                </button>
                            </h2>
                            <div id="collapseThree" class="accordion-collapse collapse" aria-labelledby="headingThree" data-bs-parent="#accordionExample">
                                <div class="accordion-body">
                                    <strong>Culminación de estudios.</strong> Muchos jóvenes pueden finalizar su carrera con mayor oportunidad de apoyo.
                                </div>
                            </div>
                        </div>
                    </div>


                    <!-- finaliza el acordion -->
                </div>

                <div class="col-xl-6">
                    <div class="p-5">
                        <iframe src="https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d15121.018549177388!2d-100.906505!3d18.652566!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x53b7d6993bd1cc33!2sInstituto%20Tecnol%C3%B3gico%20Superior%20de%20Huetamo!5e0!3m2!1ses-419!2smx!4v1631130502000!5m2!1ses-419!2smx" width="400" height="300" style="border:0;" allowfullscreen="" loading="lazy"></iframe>
                    </div>
                </div >

            </div>
            <!-- Aquí inicia una sección de cards-->
            <div class="card" style="width: 18rem;">
                <img src="..." class="card-img-top" alt="...">
                <div class="card-body">
                    <h5 class="card-title">Card title</h5>
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                    <a href="#" class="btn btn-primary">Go somewhere</a>
                </div>
            </div>

        </section>   
    </body>
</html>
