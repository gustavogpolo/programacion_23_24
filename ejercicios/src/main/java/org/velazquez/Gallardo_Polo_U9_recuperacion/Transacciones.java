package org.velazquez.Gallardo_Polo_U9_recuperacion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Transacciones {

    public Transacciones() {
    }

    public void transaccion1() {
        Connection con = ConexionBD.getConnection();
        Scanner teclado = new Scanner(System.in);

        try {
            con.setAutoCommit(false);
            System.out.println("           INSERCION DE LA OFICINA");

            // INSERT INTO "LA TABLA" ("CAMPOS QUE VAS A METER") VALUES (?,? TANTAS COMO CAMPOS HAYA)
            String sql = "INSERT INTO offices (officeCode,city,phone,addressLine1,addressLine2,state,country,postalCode,territory) VALUES (?,?,?,?,?,?,?,?,?)";
            PreparedStatement statement = con.prepareStatement(sql);

            System.out.println("Numero de oficina: 8");
            String officeCode = "30";

            System.out.println("Introduce la ciudad: Sevilla");
            String city = "Prueba2";

            System.out.println("Introduce el número de teléfono: +34 954368714");
            String phone = "+34 954368714";

            System.out.println("Introduce la primera direccion: 6 Avenida de la Cruz Roja");
            String addressLine1 = "6 Avenida de la Cruz Roja";

            System.out.println("Introduce la segunda direccion: 8 Avenida de la Cruz Roja");
            String addressLine2 = "8 Avenida de la Cruz Roja";

            System.out.println("Introduce el Estado: Andalucía");
            String state = "Andalucía";

            System.out.println("Introduce el pais: Espana");
            String country = "Espana";

            System.out.println("Introduce el codigo postal: 41009");
            String codPostalCliente = "41009";

            System.out.println("Introduce el territorio: EMEA");
            String territory = "EMEA";

            statement.setString(1, officeCode); // Posicion de la interrogación de arriba
            statement.setString(2, city);
            statement.setString(3, phone);
            statement.setString(4, addressLine1);
            statement.setString(5, addressLine2);
            statement.setString(6, state);
            statement.setString(7, country);
            statement.setString(8, codPostalCliente);
            statement.setString(9, territory);

            // INT E IF DE DESPUÉS SE PUEDEN QUITAR
            // statement.executeUpdate();
            // SIN IF (INSERCIONCLIENTE)
            int insercionOficina = statement.executeUpdate(); // Para ejecutar el comando
            // IMPORTANTISIMO
            con.commit();

            if (insercionOficina != 0) {
                System.out.println("Se ha creado la oficina con exito");
                System.out.println();
            } else {
                System.out.println("Error al añadir la oficina");
                System.out.println();
            }

            System.out.println("           INSERCION DEL EMPLEADO 1");

            // INSERT INTO "LA TABLA" ("CAMPOS QUE VAS A METER") VALUES (?,? TANTAS COMO CAMPOS HAYA)
            String sql3 = "INSERT INTO employees (employeeNumber,lastName,firstName,extension,email,officeCode,reportsTo,jobTitle) VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement statement3 = con.prepareStatement(sql3);

            System.out.println("Numero del empleado 1: 1.111");
            int employee1Number = 1234311;

            System.out.println("Apellido del empleado 1: Estoy Nervioso");
            String employee1LastName = "Estoy Nervioso";

            System.out.println("Nombre del empleado 1: Chema");
            String employee1FirstName = "Chema";

            System.out.println("Extension del empleado 1: x9999");
            String employee1Extension = "x9999";

            System.out.println("Email del empleado 1: empleado1@classicmodelcars.com");
            String employee1Email = "empleado1@classicmodelcars.com";

            System.out.println("Número de oficina del empleado 1: 8");
            String employee1OficeCode = "8";

            System.out.println("Jefe del empleado 1: 1.056");
            int employee1ReportsTo = 1056;

            System.out.println("Título del empleado 1: Sales Rep");
            String employee1Jobtitle = "Sales Rep";


            statement3.setInt(1, employee1Number); // Posicion de la interrogación de arriba
            statement3.setString(2, employee1LastName);
            statement3.setString(3, employee1FirstName);
            statement3.setString(4, employee1Extension);
            statement3.setString(5, employee1Email);
            statement3.setString(6, employee1OficeCode);
            statement3.setInt(7, employee1ReportsTo);
            statement3.setString(8, employee1Jobtitle);

            // INT E IF DE DESPUÉS SE PUEDEN QUITAR
            // statement.executeUpdate();
            // SIN IF (INSERCIONCLIENTE)
            int insercionEmpleado1 = statement3.executeUpdate(); // Para ejecutar el comando
            // IMPORTANTISIMO
            con.commit();

            if (insercionEmpleado1 != 0) {
                System.out.println("Se ha creado la oficina con exito");
                System.out.println();
            } else {
                System.out.println("Error al añadir la oficina");
                System.out.println();
            }

            System.out.println("           INSERCION DEL EMPLEADO 2");

            // INSERT INTO "LA TABLA" ("CAMPOS QUE VAS A METER") VALUES (?,? TANTAS COMO CAMPOS HAYA)
            String sql4 = "INSERT INTO employees (employeeNumber,lastName,firstName,extension,email,officeCode,reportsTo,jobTitle) VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement statement4 = con.prepareStatement(sql4);

            System.out.println("Numero del empleado 2: 1.112");
            int employee2Number = 234451;

            System.out.println("Apellido del empleado 2: Viva el");
            String employee2LastName = "Viva el";

            System.out.println("Nombre del empleado 2: Cadiz");
            String employee2FirstName = "Cadiz";

            System.out.println("Extension del empleado 2: x9998");
            String employee2Extension = "x9998";

            System.out.println("Email del empleado 2: empleado2@classicmodelcars.com");
            String employee2Email = "empleado2@classicmodelcars.com";

            System.out.println("Número de oficina del empleado 2: 8");
            String employee2OficeCode = "8";

            System.out.println("Jefe del empleado 2: 1.056");
            int employee2ReportsTo = 1056;

            System.out.println("Título del empleado 2: Sales Rep");
            String employee2Jobtitle = "Sales Rep";


            statement4.setInt(1, employee2Number); // Posicion de la interrogación de arriba
            statement4.setString(2, employee2LastName);
            statement4.setString(3, employee2FirstName);
            statement4.setString(4, employee2Extension);
            statement4.setString(5, employee2Email);
            statement4.setString(6, employee2OficeCode);
            statement4.setInt(7, employee2ReportsTo);
            statement4.setString(8, employee2Jobtitle);

            // INT E IF DE DESPUÉS SE PUEDEN QUITAR
            // statement.executeUpdate();
            // SIN IF (INSERCIONCLIENTE)
            int insercionEmpleado2 = statement4.executeUpdate(); // Para ejecutar el comando
            // IMPORTANTISIMO
            con.commit();

            if (insercionEmpleado2 != 0) {
                System.out.println("Se ha creado la oficina con exito");
                System.out.println();
            } else {
                System.out.println("Error al añadir la oficina");
                System.out.println();
            }

            System.out.println("\n-----------------------------------------------------");
            System.out.println("         INSERCION DEL Cliente");

            String sql2 = "INSERT INTO customers (customerNumber,customerName,contactLastName,contactFirstName,phone,addressLine1,addressLine2,city,state,postalCode,country,salesRepEmployeeNumber,creditLimit) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement statement2 = con.prepareStatement(sql2);

            System.out.print("Introduce el numero del cliente: ");
            String customerNumber = "0123640";

            System.out.print("Introduce el nombre del cliente: ");
            String customerName = "v";

            System.out.print("Introduce el apellido del contacto: ");
            String contactLastName = "v";

            System.out.print("Introduce el nombre del contacto: ");
            String contactFirstName = "v";

            System.out.print("Introduce el número de teléfono del contacto: ");
            String ContactPhone = "690689689";

            System.out.print("Introduce la primera dirección del contacto: ");
            String  ContactaddressLine1 = "v";

            System.out.print("Introduce la segunda dirección del contacto: ");
            String ContactaddressLine2 = " ";


            System.out.print("Introduce la ciudad del contacto: ");
            String Contactcity = "v";

            System.out.print("Introduce el estado del contacto: ");
            String Contactstate = "v";

            System.out.print("Introduce el código postal del contacto: ");
            String ContactpostalCode = "34959";

            System.out.print("Introduce el país del contacto: ");
            String Contactcountry = "Andorra";

            System.out.print("Introduce el responsable de ventas del contacto: 9.999");
            String salesRepEmployeeNumber = "23445";

            System.out.print("Introduce el límite de crédito del contacto: ");
            String creditLimit = "93475897";


            statement2.setString(1, customerNumber);
            statement2.setString(2, customerName);
            statement2.setString(3, contactLastName);
            statement2.setString(4, contactFirstName);
            statement2.setString(5, ContactPhone);
            statement2.setString(6, ContactaddressLine1);
            statement2.setString(7, ContactaddressLine2);
            statement2.setString(8, Contactcity);
            statement2.setString(9, Contactstate);
            statement2.setString(10, ContactpostalCode);
            statement2.setString(11, Contactcountry);
            statement2.setString(12, salesRepEmployeeNumber);
            statement2.setString(13, creditLimit);
            //statement2.get

            int insercionCliente = statement2.executeUpdate();
            con.commit();

            if (insercionCliente != 0) {
                System.out.println("Se ha insertado el cliente");
                System.out.println();
            } else {
                System.out.println("Error al añadir el cliente");
                System.out.println();
            }

        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }


    public void transaccion2() {
        Connection con = ConexionBD.getConnection();
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("\n-----------------------------------------------------");
            System.out.println("         PRODUCTO 1");
            String sql = "INSERT INTO orderdetails (orderNumber,productCode,quantityOrdered,priceEach,orderLineNumber) VALUES (?,?,?,?,?)";
            PreparedStatement statement = con.prepareStatement(sql);

            System.out.print("Número de pedido: 10426");
            int orderNumber = 10426;

            System.out.print("Codig del producto 1: S18_3232");
            String product1Code = "S18_3232";

            System.out.print("Cantidad a pedir: ");
            int quantity1Ordered = teclado.nextInt();

            System.out.print("Precio/Unidad: ");
            double priceEach1 = 77.90;

            System.out.print("LineNumber producto 1: ");
            int orderLineNumber1 = teclado.nextInt();

            statement.setInt(1, orderNumber);
            statement.setString(2, product1Code);
            statement.setInt(3, quantity1Ordered);
            statement.setDouble(4, priceEach1);
            statement.setInt(5, orderLineNumber1);

            int anadirProducto1 = statement.executeUpdate();
            if (anadirProducto1 != 0) {
                System.out.println("Producto 2 añadido correctamente");
            } else {
                System.out.println("Error al añadir el producto");
            }

            System.out.println("\n-----------------------------------------------------");
            System.out.println("         PRODUCTO 2");
            String sql2 = "INSERT INTO orderdetails (orderNumber,productCode,quantityOrdered,priceEach,orderLineNumber) VALUES (?,?,?,?,?)";
            PreparedStatement statement2 = con.prepareStatement(sql2);

            System.out.print("Codig del producto 2: S10_1678 ");
            String product2Code = "S10_1678";

            System.out.print("Cantidad a pedir: ");
            int quantity2Ordered = teclado.nextInt();

            System.out.print("Precio/Unidad: ");
            double priceEach2 = 48.81;

            System.out.print("LineNumber producto 2: ");
            int orderLineNumber2 = teclado.nextInt();

            statement.setInt(1, orderNumber);
            statement2.setString(2, product2Code);
            statement2.setInt(3, quantity2Ordered);
            statement2.setDouble(4, priceEach2);
            statement2.setInt(5, orderLineNumber2);

            int anadirProducto2 = statement.executeUpdate();
            if (anadirProducto2 != 0) {
                System.out.println("Producto 2 añadido correctamente");
            } else {
                System.out.println("Error al añadir el producto");
            }

        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
