<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
  <!--Import jQuery before materialize.js-->
  <!--<script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>-->
  <!--<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.7/js/materialize.min.js"></script>-->
  <!--<script src="https://cdn.datatables.net/1.10.12/js/jquery.dataTables.min.js"></script>-->

  <!--JavaScript at end of body for optimized loading-->
  <!--<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>-->
 <!-- <script type="text/javascript" src="js/jquery-2.1.1.min.js"></script>-->
  <script type="text/javascript" src='js/jquery.min.js'></script>
  <script type="text/javascript" src="js/materialize.min.js"></script>
  <script type="text/javascript" src="js/index.js"></script>

  <script type="text/javascript" src="js/dataTables.bootstrap.min.js"></script>
   <!--Esta Linea Pone los iconos en los encabezados de la tabla para cambiar el orde asc o desc.-->

  <script type="text/javascript" src="js/jquery.dataTables.min.js"></script>


<script type="text/javascript">
    $(document).ready(function() {
    $('#example').DataTable({
      "language": {
                    "sProcessing":     "Procesando...",
                    "sLengthMenu":     "Mostrar _MENU_ registros",
                    "sZeroRecords":    "No se encontraron resultados",
                    "sEmptyTable":     "NingÃºn dato disponible en esta tabla",
                    "sInfo":           "Mostrando registros del _START_ al _END_ de un total de _TOTAL_ registros",
                    "sInfoEmpty":      "Mostrando registros del 0 al 0 de un total de 0 registros",
                    "sInfoFiltered":   "(filtrado de un total de _MAX_ registros)",
                    "sInfoPostFix":    "",
                    "sSearch":         "Buscar:",
                    "sUrl":            "",
                    "sInfoThousands":  ",",
                    "sLoadingRecords": "Cargando...",
                    "oPaginate": {
                        "sFirst":    "Primero",
                        "sLast":     "Ãltimo",
                        "sNext":     "Siguiente",
                        "sPrevious": "Anterior"
                    },
                    "oAria": {
                        "sSortAscending":  ": Activar para ordenar la columna de manera ascendente",
                        "sSortDescending": ": Activar para ordenar la columna de manera descendente"
                    }
                }
    });
  //$("select").val('5');
  $('select').addClass("browser-default");
  $('select').material_select();
} );

</script>

