package org.velazquez.Gallardo_Polo_U9_recuperacion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Consultas {

    public Consultas() {
    }

    public void empleadosOficinaMayor() {
        // objeto conexion
        Connection con = ConexionBD.getConnection();

        try {
            //Lo de DESC LIMIT 1 lo he tenido que buscar en internet porque no tenia ni idea
            String sql = "SELECT * FROM employees WHERE officeCode = (SELECT officeCode FROM employees GROUP BY officeCode ORDER BY COUNT(*) DESC LIMIT 1) ";
            // OBLIGATORIO
            PreparedStatement statement = con.prepareStatement(sql);
            // FILA X FILA IMPRIMIENDO DATOS rs.getTipodato ("NOMBRE COLUMNA")
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                System.out.println("Numero de empleado: " + rs.getInt("employeeNumber"));
                System.out.println("Nombre: " + rs.getString("firstName"));
                System.out.println("Apellido: " + rs.getString("lastName"));
                System.out.println("Extension: " + rs.getString("extension"));
                System.out.println("Email: " + rs.getString("email"));
                System.out.println("Oficina: " + rs.getString("officeCode"));
                System.out.println("ReportsTo: " + rs.getInt("reportsTo"));
                System.out.println("Titulo: " + rs.getString("jobTitle"));
                System.out.println("------------------------------------------------");
                System.out.println();
            }

        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }


    public void productosVendidos() {
        Connection con = ConexionBD.getConnection();

        try {
            String sql = "SELECT c.customerName, o.orderDate, o.status, p.productName, od.quantityOrdered, p.buyprice FROM customers c join orders o on c.customerNumber = o.customerNumber join orderdetails od on o.orderNumber = od.orderNumber join products p on od.productCode = p.productCode;";
            PreparedStatement statement = con.prepareStatement(sql);

            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                System.out.println("Nombre del Cliente: " + rs.getString("c.customerName"));
                System.out.println("Fecha del pedido: " + rs.getDate("o.orderDate"));
                System.out.println("Estado del pedido: " + rs.getString("o.status"));
                System.out.println("Nombre del producto: " + rs.getString("p.productName"));
                System.out.println("Cantidad pedida: " + rs.getInt("od.quantityOrdered"));
                System.out.println("Precio de venta: " + rs.getDouble("p.buyprice"));
                System.out.println("------------------------------------------------------");
                System.out.println();
            }

        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
