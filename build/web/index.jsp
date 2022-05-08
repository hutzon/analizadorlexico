<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Analizador Léxico</title>
        <link href="css/bootstrap.css" rel="stylesheet">
    </head>
    <body>
        <div class="index">
            <div class="panel-heading">
                <h3 class="panel-title">Analizador Léxico</h3>          
            </div>
            <form class="form-container" action="analizar" method="post">
                <div class="form-group">
                    <label for="cadena">Cadena:</label>
                   <!-- <input type="text" class="form-control" name="cadena" id="cadena" value="" placeholder="Escriba la cadena">-->
                   <div class="panel-area"> 
                       <textarea type="text" name="cadena" id="cadena" value="" placeholder="Escriba la cadena" style=" margin-left: 10%; margin-right:10%; width: 80%; height: 200px; border-radius: 5px"></textarea>
                   </div>
                </div>       

                <div class="btn-index">
                    <button type="submit" class="btn-analizar" >Analizar</button>
                </div>

            </form>
        </div>

    </body>
</html>