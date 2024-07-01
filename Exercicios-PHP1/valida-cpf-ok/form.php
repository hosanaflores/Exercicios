<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>CPF</title>

    <style type="text/css">
        html body 
        {
            width: 100%;
            height: 100%;
        }
        fieldset 
        {
            width: 60%;
            text-align: center;
        }
        input[type=submit]
        {
            margin: 5px 0;
            cursor: pointer;
            width: 80px;
            font-size: 15px;
            background-color: grey;
            color: white;

        }
     </style>

</head>
<body>
        <fieldset>
            <legend><h2>VALIDAÇÃO DE CPF</h2></legend>

            <form method="POST" action="mostrar.php">
                <input type="text" name="cpf" required="" maxlength="11"></br>
                <input type="submit" name="enviar">
            </form>
        </fieldset>
    
</body>
</html>