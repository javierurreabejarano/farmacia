/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package datos.interfaces;

import java.util.List;

/**
 *
 * @author USER
 */
public interface CrudPaginadoInterface<T> {
    public List<T> listar(String texto, int totalPorPagina, int numPagina);
    public boolean insertar(T obj);
    public boolean actualizar(T obj); 
    public boolean desactivar(int id);
    public boolean activar(int id);
    public int total();
    public boolean existe(String texto);
}

