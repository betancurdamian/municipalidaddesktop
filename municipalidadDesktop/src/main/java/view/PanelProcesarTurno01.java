/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.PersonaController;
import controller.ProcesarTurnoController;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import model.Persona;
import view.resources.TablaPersonaModelo;
import view.resources.TablaPersonaProcesarTurnoModelListener;

/**
 *
 * @author Ariel
 */
public class PanelProcesarTurno01 extends javax.swing.JPanel implements InterfacePanel {

    private final ValidadorDeCampos validador;

    //variables de tabla
    private final TablaPersonaModelo tablaPersonaModelo;

    //variables de comboBox
    private final DefaultComboBoxModel tipoPersonaModel;

    private final PersonaController controladorPersona;
    private ProcesarTurnoController controlador;

    private Persona personaSeleccionada;

    private final List<Persona> personas;

    /**
     * Creates new form PanelPersona
     */
    public PanelProcesarTurno01() {
        //JTable vacio
        this.tablaPersonaModelo = new TablaPersonaModelo();
        this.validador = new ValidadorDeCampos();
        //JComboBox vacio
        this.tipoPersonaModel = new DefaultComboBoxModel();

        this.personas = new ArrayList<>();
        initComponents();
        habilitarTodosLosBotones(false);
        this.validador.habilitarBoton(true, this.jbtn_volver, Color.red, Color.WHITE, null, null);
        this.validador.habilitarBoton(true, this.jbtn_listar, new Color(30, 132, 73), Color.WHITE, null, null);
        this.validador.habilitarBoton(false, this.jbtn_siguiente, new Color(30, 132, 73), Color.WHITE, null, null);

        habilitarTodosLosCampos(false);

        //iniciar el controladorPersona de esta vista
        this.controladorPersona = new PersonaController();
        setSize(800, 600);

        //agrega escuchadores de las tablas
        this.jtb_persona.getSelectionModel().addListSelectionListener(new TablaPersonaProcesarTurnoModelListener(this));

        limpiarTodosLosCampos();

        this.validador.LimitarCaracteres(this.jtf_dni, 8);
        this.validador.validarSoloNumero(this.jtf_dni);
        this.validador.LimitarCaracteres(this.jtf_buscarPersona, 8);
        this.validador.validarSoloNumero(this.jtf_buscarPersona);

        this.validador.validarSoloLetras(jtf_nombre);
        this.validador.LimitarCaracteres(this.jtf_nombre, 30);
        this.validador.validarSoloLetras(jtf_apellido);
        this.validador.LimitarCaracteres(this.jtf_apellido, 30);

        this.jpb_estado_procesarTurno.setStringPainted(true);
        this.jpb_estado_procesarTurno.setString("Seleccionar Persona");
        this.jpb_estado_procesarTurno.setValue(15);
        this.jpb_estado_procesarTurno.setForeground(new Color(220, 118, 51));

        this.jlbl_titulo.setBackground(Color.BLACK);
        this.jlbl_titulo.setOpaque(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelProgreso = new javax.swing.JPanel();
        jpb_estado_procesarTurno = new javax.swing.JProgressBar();
        jlbl_titulo = new javax.swing.JLabel();
        jPanel_crud = new javax.swing.JPanel();
        jScrollPaneTabla = new javax.swing.JScrollPane();
        jtb_persona = new javax.swing.JTable();
        jbtn_listar = new javax.swing.JButton();
        jtf_buscarPersona = new javax.swing.JTextField();
        jPanel_datos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtf_nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtf_apellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtf_dni = new javax.swing.JTextField();
        jlbl_alertaNombre = new javax.swing.JLabel();
        jlbl_alertaApellido = new javax.swing.JLabel();
        jlbl_alertaDNI = new javax.swing.JLabel();
        jlbl_alertaTipoPersona = new javax.swing.JLabel();
        jbtn_siguiente = new javax.swing.JButton();
        jbtn_volver = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(950, 750));
        setMinimumSize(new java.awt.Dimension(950, 750));
        setPreferredSize(new java.awt.Dimension(950, 750));

        jpb_estado_procesarTurno.setName(""); // NOI18N

        jlbl_titulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbl_titulo.setForeground(new java.awt.Color(255, 255, 255));
        jlbl_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbl_titulo.setText("PROCESAR TURNO");

        javax.swing.GroupLayout jPanelProgresoLayout = new javax.swing.GroupLayout(jPanelProgreso);
        jPanelProgreso.setLayout(jPanelProgresoLayout);
        jPanelProgresoLayout.setHorizontalGroup(
            jPanelProgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProgresoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelProgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbl_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpb_estado_procesarTurno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelProgresoLayout.setVerticalGroup(
            jPanelProgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProgresoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpb_estado_procesarTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPaneTabla.setMaximumSize(new java.awt.Dimension(950, 750));
        jScrollPaneTabla.setMinimumSize(new java.awt.Dimension(950, 750));
        jScrollPaneTabla.setPreferredSize(new java.awt.Dimension(950, 750));

        jtb_persona.setModel(tablaPersonaModelo);
        jScrollPaneTabla.setViewportView(jtb_persona);

        jbtn_listar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jbtn_listar.setText("LISTAR");
        jbtn_listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_listarActionPerformed(evt);
            }
        });

        jtf_buscarPersona.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtf_buscarPersona.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtf_buscarPersonaFocusGained(evt);
            }
        });
        jtf_buscarPersona.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtf_buscarPersonaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel_crudLayout = new javax.swing.GroupLayout(jPanel_crud);
        jPanel_crud.setLayout(jPanel_crudLayout);
        jPanel_crudLayout.setHorizontalGroup(
            jPanel_crudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_crudLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel_crudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_crudLayout.createSequentialGroup()
                        .addComponent(jScrollPaneTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 909, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1, Short.MAX_VALUE))
                    .addGroup(jPanel_crudLayout.createSequentialGroup()
                        .addComponent(jbtn_listar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jtf_buscarPersona)))
                .addContainerGap())
        );
        jPanel_crudLayout.setVerticalGroup(
            jPanel_crudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_crudLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPaneTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel_crudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtn_listar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_buscarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("NOMBRE");

        jtf_nombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("APELLIDO");

        jtf_apellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("DNI");

        jtf_dni.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jlbl_alertaNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jlbl_alertaApellido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jlbl_alertaDNI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jlbl_alertaTipoPersona.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel_datosLayout = new javax.swing.GroupLayout(jPanel_datos);
        jPanel_datos.setLayout(jPanel_datosLayout);
        jPanel_datosLayout.setHorizontalGroup(
            jPanel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_datosLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(jPanel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_datosLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jtf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jlbl_alertaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_datosLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jtf_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jlbl_alertaApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_datosLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jtf_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jlbl_alertaDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_datosLayout.createSequentialGroup()
                        .addGap(500, 500, 500)
                        .addComponent(jlbl_alertaTipoPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(270, Short.MAX_VALUE))
        );
        jPanel_datosLayout.setVerticalGroup(
            jPanel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_datosLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbl_alertaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbl_alertaApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbl_alertaDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jlbl_alertaTipoPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jbtn_siguiente.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jbtn_siguiente.setText("SIGUIENTE");
        jbtn_siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_siguienteActionPerformed(evt);
            }
        });

        jbtn_volver.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jbtn_volver.setText("VOLVER");
        jbtn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_volverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_datos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtn_siguiente, javax.swing.GroupLayout.DEFAULT_SIZE, 930, Short.MAX_VALUE)
                    .addComponent(jbtn_volver, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelProgreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_crud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelProgreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel_crud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_datos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jbtn_siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Controla el boton volver
     *
     * @param evt
     */
    private void jbtn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_volverActionPerformed
        //Inhabilita Botones
        habilitarTodosLosBotones(false);

        //limpia todos los campos
        limpiarTodosLosCampos();

        //Habilita el Arbol de seleccion
        JFramePrincipal.getArbolModulos().setEnabled(true);
        JFramePrincipal.getjPanelContenido().removeAll();
        JFramePrincipal.getjPanelContenido().repaint();
    }//GEN-LAST:event_jbtn_volverActionPerformed

    /**
     * Controla el boton Listar
     *
     * @param evt
     */
    private void jbtn_listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_listarActionPerformed
        //Actualizar el TableModel con la lista del controladorPersona
        this.tablaPersonaModelo.setPersonas(this.controladorPersona.buscarTodasLasPersonas());

        //Refrescar el modelo en la tabla
        this.tablaPersonaModelo.fireTableDataChanged();

        limpiarTodosLosCampos();
        habilitarTodosLosCampos(false);
        habilitarTodosLosBotones(false);

        this.validador.habilitarBoton(false, this.jbtn_siguiente, new Color(30, 132, 73), Color.WHITE, null, null);
        this.validador.habilitarBoton(true, this.jbtn_listar, new Color(30, 132, 73), Color.WHITE, null, null);
        this.validador.habilitarCampo(true, this.jtf_buscarPersona);

        this.personaSeleccionada = null;

    }//GEN-LAST:event_jbtn_listarActionPerformed

    /**
     * Controla el boton agregar
     *
     * @param evt
     */
    private void jbtn_siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_siguienteActionPerformed

        this.controlador = new ProcesarTurnoController(personaSeleccionada);

        //Se crea el Panel Emplesa    
        PanelProcesarTurno02 unPanelProcesarTurno02 = new PanelProcesarTurno02(this.controlador);
        unPanelProcesarTurno02.setSize(950, 750);
        unPanelProcesarTurno02.setLocation(0, 0);
        unPanelProcesarTurno02.setVisible(true);

        //JFramePrincipal.modificarPanelContenido(unPanelProcesarTurno02);
        JFramePrincipal.getjPanelContenido().removeAll();
        JFramePrincipal.getjPanelContenido().add(unPanelProcesarTurno02);
        JFramePrincipal.getjPanelContenido().repaint();
        JFramePrincipal.getjPanelContenido().validate();
    }//GEN-LAST:event_jbtn_siguienteActionPerformed

    /**
     * Controla el Foco del JTextFiel buscar persona
     *
     * @param evt
     */
    private void jtf_buscarPersonaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtf_buscarPersonaFocusGained
        if (this.jtf_buscarPersona.isEditable()) {
            this.tablaPersonaModelo.setPersonas(this.controladorPersona.buscarTodasLasPersonas());

            //Refrescar el modelo en la tabla
            this.tablaPersonaModelo.fireTableDataChanged();

            limpiarTodosLosCampos();
            habilitarTodosLosCampos(false);
            habilitarTodosLosBotones(false);

            this.validador.habilitarBoton(false, this.jbtn_siguiente, new Color(30, 132, 73), Color.WHITE, null, null);
            this.validador.habilitarBoton(true, this.jbtn_listar, new Color(30, 132, 73), Color.WHITE, null, null);
            this.validador.habilitarCampo(true, this.jtf_buscarPersona);

            this.personaSeleccionada = null;

            this.jtb_persona.setEnabled(true);

            this.jlbl_alertaNombre.setIcon(null);
            this.jlbl_alertaApellido.setIcon(null);
            this.jlbl_alertaDNI.setIcon(null);

        }
    }//GEN-LAST:event_jtf_buscarPersonaFocusGained

    /**
     * Escucha si en el JTextFiel buscar persona se presionan teclas
     *
     * @param evt
     */
    private void jtf_buscarPersonaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_buscarPersonaKeyReleased
        if (this.jtf_buscarPersona.isEditable()) {
            //Actualizar el TableModel con la lista del controladorPersona
            this.tablaPersonaModelo.setPersonas(this.controladorPersona.buscarPersonasPorDNI(this.jtf_buscarPersona.getText()));

            //Refrescar el modelo en la tabla
            this.tablaPersonaModelo.fireTableDataChanged();
        }
    }//GEN-LAST:event_jtf_buscarPersonaKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanelProgreso;
    private javax.swing.JPanel jPanel_crud;
    private javax.swing.JPanel jPanel_datos;
    private javax.swing.JScrollPane jScrollPaneTabla;
    private javax.swing.JButton jbtn_listar;
    private javax.swing.JButton jbtn_siguiente;
    private javax.swing.JButton jbtn_volver;
    private javax.swing.JLabel jlbl_alertaApellido;
    private javax.swing.JLabel jlbl_alertaDNI;
    private javax.swing.JLabel jlbl_alertaNombre;
    private javax.swing.JLabel jlbl_alertaTipoPersona;
    private javax.swing.JLabel jlbl_titulo;
    private javax.swing.JProgressBar jpb_estado_procesarTurno;
    private javax.swing.JTable jtb_persona;
    private javax.swing.JTextField jtf_apellido;
    private javax.swing.JTextField jtf_buscarPersona;
    private javax.swing.JTextField jtf_dni;
    private javax.swing.JTextField jtf_nombre;
    // End of variables declaration//GEN-END:variables

    //--------------------------------------------------------------------------
    //--------------------------Metodos Implementados---------------------------
    //--------------------------------------------------------------------------
    @Override
    public void habilitarTodosLosCampos(boolean estado) {
        this.validador.habilitarCampo(estado, this.jtf_nombre);
        this.validador.habilitarCampo(estado, this.jtf_apellido);
        this.validador.habilitarCampo(estado, this.jtf_dni);
        this.validador.habilitarCampo(estado, this.jtf_buscarPersona);
    }

    @Override
    public void limpiarTodosLosCampos() {
        this.validador.limpiarCampo(this.jtf_nombre);
        this.validador.limpiarCampo(this.jtf_apellido);
        this.validador.limpiarCampo(this.jtf_dni);
        this.validador.limpiarCampo(this.jtf_buscarPersona);
    }

    @Override
    public void habilitarTodosLosBotones(boolean estado) {
        this.validador.habilitarBoton(true, this.jbtn_listar, new Color(30, 132, 73), Color.WHITE, null, null);
        this.validador.habilitarBoton(estado, this.jbtn_siguiente, new Color(30, 132, 73), Color.WHITE, null, null);
    }

    //--------------------------------------------------------------------------
    //--------------------------Metodos Getters y Settes------------------------
    //--------------------------------------------------------------------------
    public javax.swing.JButton getJbtn_agregar() {
        return this.jbtn_siguiente;
    }

    public ValidadorDeCampos getValidador() {
        return this.validador;
    }

    public javax.swing.JTextField getJtf_buscarPersona() {
        return this.jtf_buscarPersona;
    }

    public Persona getPersonaSeleccionada() {
        return this.personaSeleccionada;
    }

    public void setPersonaSeleccionada(Persona personaSeleccionada) {
        this.personaSeleccionada = personaSeleccionada;
    }

    //--------------------------------------------------------------------------
    //--------------------------Metodos Adicionales-----------------------------
    //--------------------------------------------------------------------------
    

    /**
     * Selecciona una fila de la tabla, devolviendo un objeto Persona
     */
    public void seleccionarPersona() {
        //obtiene el indice de la fila seleccionada en la tabla de personas
        int filaSeleccionada = this.jtb_persona.getSelectedRow();
        // si la fila esta seleccionada, seteamos la persona auxiliar, llamando al modelo de tabla
        if (filaSeleccionada >= 0) {
            this.personaSeleccionada = this.tablaPersonaModelo.obtenerPersonaEn(filaSeleccionada);
            this.jtf_nombre.setText(this.personaSeleccionada.getNombre());
            this.jtf_apellido.setText(this.personaSeleccionada.getApellido());
            this.jtf_dni.setText(this.personaSeleccionada.getDni());
            this.validador.habilitarBoton(true, this.jbtn_siguiente, new Color(30, 132, 73), Color.WHITE, null, null);
        } else {

        }
    }

}
