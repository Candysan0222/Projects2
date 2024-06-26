// See https://aka.ms/new-console-template for more information


using static System.Runtime.InteropServices.JavaScript.JSType;

Console.WriteLine(" Calculadora " );
Console.WriteLine("Digite a continuacion la operacion que desea realizar");

Console.WriteLine("-----------------");
Console.WriteLine("      Suma       ");
Console.WriteLine("      Resta      ");
Console.WriteLine("  Multiplicacion ");
Console.WriteLine("     Division    ");
Console.WriteLine("    Porcentaje    ");
Console.WriteLine("-----------------");
string sign = Console.ReadLine();

Console.WriteLine("A continuacion digite dos valores numericos ");
Console.WriteLine("Primer dato numerico");
Double num1 = Double.Parse(Console.ReadLine());

Console.WriteLine("Segundo dato numerico");
Double num2 = Double.Parse(Console.ReadLine());

int y = Convert.ToInt32(num1);
double enter = num1 - y;
int z = Convert.ToInt32(num2);
double enter2 = num2 - z;
Double result = 0;
if (enter == 0 && enter2 == 0)
{
    switch (sign)
    {
        case "Suma":

            result = num1 + num2;
            break;
        case "Resta":
            result = num1 - num2;
            break;
        case "Multiplicacion":
            result = num1 * num2;
            break;
        case "Division":
            if (num2 != 0)
            {
                result = num1 / num2;
            }
            else
            {
                Console.WriteLine("Error: No se puede dividir por cero.");
                return;
            }
            break;
        case "Porcentaje":

            result = (num1 * num2) / 100;

            break;
        default:
            Console.WriteLine("Siga las instrucciones adecuadamente y vuelva a intentarlo");
            return;
    }


    Console.WriteLine("El resultado de la " + sign + " realizada es: " + result);
}
else
{
    Console.WriteLine("Ingrese numeros enteros");
}








