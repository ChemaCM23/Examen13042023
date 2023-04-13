package views;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JTextField;

import controllers.MunicipioController;
import controllers.ProvinciaController;

import models.Municipio;
import models.Provincia;


import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class VentanaPrincipalMunicipios extends JPanel {
	private JTextField jtfFiltrar;
	private JTextField jtfMunicipioNombre;
	private JComboBox <Provincia> jcbProvincia;
	private JComboBox<Municipio> jcbMunicipio;
	
	
	
	
	public VentanaPrincipalMunicipios() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWeights = new double[]{1.0, 1.0};
//		gridBagLayout.columnWeights = new double[]{1.0};
//		gridBagLayout.columnWidths = new int[]{0};
//		gridBagLayout.rowHeights = new int[]{0};
//		gridBagLayout.columnWeights = new double[]{Double.MIN_VALUE};
//		gridBagLayout.rowWeights = new double[]{Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		jtfFiltrar = new JTextField();
		jtfFiltrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		GridBagConstraints gbc_jtfFiltrar = new GridBagConstraints();
		gbc_jtfFiltrar.insets = new Insets(0, 0, 5, 5);
		gbc_jtfFiltrar.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfFiltrar.gridx = 0;
		gbc_jtfFiltrar.gridy = 0;
		add(jtfFiltrar, gbc_jtfFiltrar);
		jtfFiltrar.setColumns(10);
		
		JButton btnFiltrar = new JButton("Filtrar");
		btnFiltrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		GridBagConstraints gbc_btnFiltrar = new GridBagConstraints();
		gbc_btnFiltrar.insets = new Insets(0, 0, 5, 0);
		gbc_btnFiltrar.gridx = 1;
		gbc_btnFiltrar.gridy = 0;
		add(btnFiltrar, gbc_btnFiltrar);
		
		JComboBox<Municipio> jcbSeleccionar = new JComboBox<Municipio>();
		jcbSeleccionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cargarMunicipio();
			}
		});
		GridBagConstraints gbc_jcbSeleccionar = new GridBagConstraints();
		gbc_jcbSeleccionar.insets = new Insets(0, 0, 5, 5);
		gbc_jcbSeleccionar.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbSeleccionar.gridx = 0;
		gbc_jcbSeleccionar.gridy = 1;
		add(jcbSeleccionar, gbc_jcbSeleccionar);
		
		JButton btnSeleccionar = new JButton("Seleccionar");
		btnSeleccionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//cargarMunicipio();
			}
		});
		GridBagConstraints gbc_btnSeleccionar = new GridBagConstraints();
		gbc_btnSeleccionar.insets = new Insets(0, 0, 5, 0);
		gbc_btnSeleccionar.gridx = 1;
		gbc_btnSeleccionar.gridy = 1;
		add(btnSeleccionar, gbc_btnSeleccionar);
		
		JLabel lblMunicipioSeleccionado = new JLabel("Municipio Seleccionado:");
		lblMunicipioSeleccionado.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblMunicipioSeleccionado = new GridBagConstraints();
		gbc_lblMunicipioSeleccionado.gridwidth = 2;
		gbc_lblMunicipioSeleccionado.insets = new Insets(0, 0, 5, 5);
		gbc_lblMunicipioSeleccionado.gridx = 0;
		gbc_lblMunicipioSeleccionado.gridy = 2;
		add(lblMunicipioSeleccionado, gbc_lblMunicipioSeleccionado);
		
		JLabel lblNewLabel = new JLabel("Nombre del municipio:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 3;
		add(lblNewLabel, gbc_lblNewLabel);
		
		jtfMunicipioNombre = new JTextField();
		jtfMunicipioNombre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cargarMunicipio(); 
			}
		});
		GridBagConstraints gbc_jtfMunicipioNombre = new GridBagConstraints();
		gbc_jtfMunicipioNombre.insets = new Insets(0, 0, 5, 0);
		gbc_jtfMunicipioNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfMunicipioNombre.gridx = 1;
		gbc_jtfMunicipioNombre.gridy = 3;
		add(jtfMunicipioNombre, gbc_jtfMunicipioNombre);
		jtfMunicipioNombre.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Provincia del municipio:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 4;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		jcbProvincia = new JComboBox<Provincia>();
		jcbProvincia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cargarProvincia();
			}
		});
		GridBagConstraints gbc_jcbProvincia = new GridBagConstraints();
		gbc_jcbProvincia.insets = new Insets(0, 0, 5, 0);
		gbc_jcbProvincia.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbProvincia.gridx = 1;
		gbc_jcbProvincia.gridy = 4;
		add(jcbProvincia, gbc_jcbProvincia);
		
		JButton btnGuardar = new JButton("Guardar");
		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.anchor = GridBagConstraints.EAST;
		gbc_btnGuardar.gridx = 1;
		gbc_btnGuardar.gridy = 5;
		add(btnGuardar, gbc_btnGuardar);	
		cargarProvincia();
		
		//modificar();
	}

	private void cargarProvincia() {
		List<Provincia> pro = ProvinciaController.cargarProvincia();
		for (Provincia provincia : pro) {
			jcbProvincia.addItem(provincia);
		}
	}
	
	private void cargarMunicipio() {
		Provincia p = (Provincia) jcbProvincia.getSelectedItem();
		List<Municipio> m = MunicipioController.cargarMunicipios(p.getId());

		jcbMunicipio.removeAllItems();

		for (Municipio municipio : m) {
			jcbMunicipio.addItem(municipio);
		}

	}
	private void modificar() {
		Provincia p = new Provincia();
		
		p.setId(Integer.parseInt(jtfFiltrar.getText()));
		p.setProvincia(jtfMunicipioNombre.getText());
		ProvinciaController.modificarProvincia(p);
		
	}
	
	
	

	
	

	
	
}
