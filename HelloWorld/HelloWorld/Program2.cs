using System;

public class Categoria
{
    public int Id { get; set; }
    public String NombreCategoria { get; set; }
    public String Descripcion { get; set; }

    //Constructor vacio para la enviar informacion
    public Categoria() { }

    //Constructor para recibir la informacion
    public Categoria(string nombreCategoria, string descripcion)
    {
        NombreCategoria = nombreCategoria;
        Descripcion = descripcion;

    }

    //Metodo para mostrar
    public void MostrarCategoria()
    {
        Console.WriteLine($"Nombre : {NombreCategoria}, Descripcion: {Descripcion}");
    }

    //


}
