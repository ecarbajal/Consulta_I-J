/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package contabilidad;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.table.TableModel;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
/**
 *
 * @author Eduardo Carbajal
 */
public class crearExcel {
    
    public static void crearExcelFactura(TableModel tableModel) {

        JFileChooser chooser = new JFileChooser();
        String rutaArchivo = "";
        double sumaSubtotal =0 , 
                sumaIVA = 0, 
                SumaTotal = 0, 
                sumaEfectivo = 0, 
                sumaDebito= 0,
                SumaCredito= 0, 
                SumaTransfer= 0,
                sumaCheque= 0;

        chooser.setDialogTitle("Guardar reporte");
        //Elegiremos archivos del directorio
        chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        chooser.setAcceptAllFileFilterUsed(false);
        //Si seleccionamos algún archivo retornaremos su directorio

        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            rutaArchivo = chooser.getSelectedFile().getAbsolutePath() + ".xls";
            File reporteExcel = new File(rutaArchivo);
            if (reporteExcel.exists()) {//Validamos que el archivo xls no exista y si es así lo borramos para crear uno nuevo
                reporteExcel.delete();
            } else {
                try {
                    //Creamos el archivo
                    reporteExcel.createNewFile();
                    //Creamos el libro0
                    HSSFWorkbook libro = new HSSFWorkbook();

                    FileOutputStream archivo = new FileOutputStream(reporteExcel);
                    //Creamos la hoja
                    Sheet hoja = libro.createSheet("Facturas");

                    //Creamos las filas y las columnas
                    int cols = tableModel.getColumnCount();
                    int rows = tableModel.getRowCount();
                    Cell columna = null;
                    Row fila = null;
                    String valor = null;
                    HSSFDataFormat cf = libro.createDataFormat();
                    
                    HSSFCellStyle csEnc = libro.createCellStyle();
                    csEnc.setFillForegroundColor(HSSFColor.SKY_BLUE.index);
                    csEnc.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);

                    fila = hoja.createRow(0);
                    columna = fila.createCell(0);
                    columna.setCellValue("FACTURA");
                    columna.setCellStyle(csEnc);
                    
                    columna = fila.createCell(1);
                    columna.setCellValue("NO CTE");
                    columna.setCellStyle(csEnc);
                    
                    columna = fila.createCell(2);
                    columna.setCellValue("NOMBRE");
                    columna.setCellStyle(csEnc);
                    
                    columna = fila.createCell(3);
                    columna.setCellValue("FECHA");
                    columna.setCellStyle(csEnc);
                    
                    columna = fila.createCell(4);
                    columna.setCellValue("SUBTOTAL");
                    columna.setCellStyle(csEnc);
                    
                    columna = fila.createCell(5);
                    columna.setCellValue("IVA");
                    columna.setCellStyle(csEnc);
                    
                    columna = fila.createCell(6);
                    columna.setCellValue("TOTAL");
                    columna.setCellStyle(csEnc);
                    
                    columna = fila.createCell(7);
                    columna.setCellValue("CFDIUUID");
                    columna.setCellStyle(csEnc);
                    
                    columna = fila.createCell(8);
                    columna.setCellValue("ORIGEN");
                    columna.setCellStyle(csEnc);
                    
                    columna = fila.createCell(9);
                    columna.setCellValue("EFECTIVO");
                    columna.setCellStyle(csEnc);
                    
                    columna = fila.createCell(10);
                    columna.setCellValue("CREDITO");
                    columna.setCellStyle(csEnc);
                    
                    columna = fila.createCell(11);
                    columna.setCellValue("DEBITO");
                    columna.setCellStyle(csEnc);
                    
                    columna = fila.createCell(12);
                    columna.setCellValue("TRANSFER");
                    columna.setCellStyle(csEnc);
                    
                    columna = fila.createCell(13);
                    columna.setCellValue("CHEQUE");
                    columna.setCellStyle(csEnc);
                    
                    String codigo;
                    
                    int c=0;
                    int i = 0;

                    for (i = 0; i < rows; i++) {
                        fila = hoja.createRow(i+1);
                        for (c = 0; c < cols; c++) {
                            valor = String.valueOf(tableModel.getValueAt(i, c)).trim();
                            codigo = String.valueOf(tableModel.getValueAt(i, 8)).trim();
                            
                            switch(c){
                                case 4:
                                    sumaSubtotal += Double.valueOf(valor);
                                    break;
                                case 5:
                                    sumaIVA += Double.valueOf(valor);
                                    break;
                                case 6:
                                    SumaTotal += Double.valueOf(valor);
                                    break;
                                case 9:
                                    sumaEfectivo += Double.valueOf(valor);
                                    System.out.println("Debes poner el valor de "+codigo);
                                    break;
                                case 10:
                                    SumaCredito += Double.valueOf(valor);
                                    break;
                                case 11:
                                    sumaDebito += Double.valueOf(valor);
                                    break;
                                case 12:
                                    SumaTransfer += Double.valueOf(valor);
                                    break;
                                case 13:
                                    sumaCheque += Double.valueOf(valor);
                                    break;
                            }
                                columna = fila.createCell(c);
                                columna.setCellValue(valor);
                          
                        }
                            
                    }
                            fila = hoja.createRow(i+1);
                            
                            columna = fila.createCell(4);
                            columna.setCellValue(sumaSubtotal);
                            columna.setCellStyle(csEnc);
                            
                            columna = fila.createCell(5);
                            columna.setCellValue(sumaIVA);
                            columna.setCellStyle(csEnc);
                            
                            columna = fila.createCell(6);
                            columna.setCellValue(SumaTotal);
                            columna.setCellStyle(csEnc);
                            
                            
                            
                            columna = fila.createCell(9);
                            columna.setCellValue(sumaEfectivo);
                            columna.setCellStyle(csEnc);
                            
                            columna = fila.createCell(10);
                            columna.setCellValue(SumaCredito);
                            columna.setCellStyle(csEnc);
                            
                            columna = fila.createCell(11);
                            columna.setCellValue(sumaDebito);
                            columna.setCellStyle(csEnc);
                            
                            columna = fila.createCell(12);
                            columna.setCellValue(SumaTransfer);
                            columna.setCellStyle(csEnc);
                            
                            columna = fila.createCell(13);
                            columna.setCellValue(sumaCheque);
                            columna.setCellStyle(csEnc);

                    //Escribimos el archivo
                    libro.write(archivo);
                    //Cerramos el flujo de datos
                    archivo.close();
                    //Abrimos el archivo
                    Desktop.getDesktop().open(reporteExcel);
                } catch (IOException ex) {
                    //Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
    } 
}
