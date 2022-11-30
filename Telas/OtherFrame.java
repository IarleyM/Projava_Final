package Telas;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Main.TopicInterface;

public class OtherFrame extends JFrame implements TopicInterface, ActionListener {

	int cidadeOrigem, cidadeDestino;

	JButton voltar;
	JLabel titulo;
	JLabel saida;
	JRadioButton hora;
	JComboBox lista, teste;
	JLabel label = new JLabel();
	JLabel label2 = new JLabel();
	JPanel panel;
	JButton button;
	JTextArea text;

	int x, y;
	static int SelectedOpc;

	public OtherFrame(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public OtherFrame() {
		setSize(320, 480);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container container = this.getContentPane();
		container.setLayout(null);
		container.setBackground(Color.black);

		criarLabel(container);
		criarField(container);
		criarButton(container);
		criarComboBox(container);

		setVisible(true);

	}

	@Override
	public void criarButton(Container c) {
		voltar = new JButton("Voltar");
		voltar.setBounds(10, 400, 100, 20);
		voltar.setToolTipText("Pagina anterior");

		voltar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				NewFrame segundo = new NewFrame();
				setVisible(false);
			}
		});
		c.add(voltar);

		button = new JButton("Visualizar");
		button.setBounds(180, 350, 100, 30);

		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (SelectedOpc == 1) {
				label = new JLabel();
				label.setText("texto");
				label.setBackground(Color.white);
				label.setBounds(150,150,50,50);
				label.setVisible(true);
				}

			}

		});

		c.add(button);
	}

	public void criarPanel(Container c) {
		panel = new JPanel();

	}

	@Override
	public void criarLabel(Container c) {
		titulo = new JLabel("Cooptranscrat®");
		titulo.setBounds(105, 0, 500, 30);
		titulo.setForeground(Color.green);
		c.add(titulo);

		saida = new JLabel("Saida");
		saida.setBounds(12, 50, 51, 20);
		saida.setForeground(Color.CYAN);
		c.add(saida);
	}

	String hChegada() {
		ArrayList<String> hChegada = new ArrayList<>();
		return hChegada();

	}

	void criarComboBox(Container c) {

		String[] hChegada1 = { "- Selecione -", "5:00", "6:00", "7:00", "8:00", "9:00", "10:00", "11:00", "12:00",
				"13:00", "14:00", "15:00", "16:00", "17:00", "18:00" };

		String[] hChegada2 = { "- Selecione -", "05:40", "06:20", "07:00", "07:40", "08:20", "09:00", "09:40", "10:20",
				"11:40", "12:20", "13:00", "14:20", "15:00", "15:40", "16:00" };

		String[] hChegada3 = { "- Selecione -", "05:40", "06:20", "07:00", "07:40", "08:20", "09:00", "10:20", "11:00 ",
				"11:40", "12:20", "13:00", "13:40 ", "14:20", "15:00", "15:40 ", "16:00" };

		String[] hChegada4 = { "- Selecione -", "5:00", "8:30", "10:00", "11:55", "14:10", "16:30" };

		String[] hChegada5 = { "- Selecione -", "5:00", "8:30", "10:00", "11:55", "14:10", "16:30" };

		String[] hChegada6 = { "- Selecione -", "06:00", "06:55", "07:45", "09:00", "10:30", "12:35", "13:05", "14:50",
				"17:15" };

		String[] hChegada7 = { "- Selecione -", "6:00", "7:45", "9:15", "13:05" };

		String[] hChegada8 = { "- Selecione -", "5:00", "8:30", "10:00", "11:55", "14:10", "16:30" };

		String[] hChegada9 = { "- Selecione -", "5:30", "5:45", "06:00", "7:30", "8:00", "8:45", "9:00", "9:45",
				"10:00", "10:45", "11:00", "11:30", "11:45", "12:00", "12:45", "13:00", "14:00", "15:00", "16:30",
				"17:00", "18:00" };

		NewFrame f1 = new NewFrame();
		f1.setVisible(false);

		if (f1.getItemSelecionado1() == 0) {
			if (f1.getItemSelecionado2() == 1) {
				lista = new JComboBox(hChegada1);
				lista.setBounds(10, 90, 170, 30);
				add(BorderLayout.WEST, lista);

				lista.addItemListener(new ItemListener() {

					@Override
					public void itemStateChanged(ItemEvent e) {
						SelectedOpc = lista.getSelectedIndex();

					}

				});
				c.add(lista);
			}
		}

		if (f1.getItemSelecionado2() == 2)

		{
			lista = new JComboBox(hChegada2);
			lista.setBounds(15, 75, 60, 240);
			add(BorderLayout.WEST, lista);
			c.add(lista);

		}
		if (f1.getItemSelecionado2() == 3) {
			lista = new JComboBox(hChegada3);
			lista.setBounds(15, 75, 40, 240);
			add(BorderLayout.WEST, lista);

			c.add(lista);
		}
		if (f1.getItemSelecionado2() == 4) {
			lista = new JComboBox(hChegada4);
			lista.setBounds(15, 75, 40, 240);
			add(BorderLayout.WEST, lista);
			c.add(lista);
		}
		if (f1.getItemSelecionado2() == 5) {
			lista = new JComboBox(hChegada5);
			lista.setBounds(15, 75, 40, 240);
			add(BorderLayout.WEST, lista);
			c.add(lista);
		}
		if (f1.getItemSelecionado2() == 6) {
			lista = new JComboBox(hChegada6);
			lista.setBounds(15, 75, 40, 240);
			add(BorderLayout.WEST, lista);
			c.add(lista);
		}

		if (f1.getItemSelecionado2() == 7) {
			lista = new JComboBox(hChegada7);
			lista.setBounds(15, 75, 40, 240);
			add(BorderLayout.WEST, lista);
			c.add(lista);
		}
		if (f1.getItemSelecionado2() == 8) {
			lista = new JComboBox(hChegada8);
			lista.setBounds(15, 75, 60, 240);
			add(BorderLayout.WEST, lista);
			c.add(lista);
		}
		if (f1.getItemSelecionado2() == 9) {
			lista = new JComboBox(hChegada9);
			lista.setBounds(15, 75, 60, 240);
			add(BorderLayout.WEST, lista);
			c.add(lista);
		}

	}

	JPanel panel1 = new JPanel();

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == lista) {
			if (SelectedOpc == 1) {
				label.setText("Iarley");
			}
		}

	}

	@Override
	public void criarField(Container c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void criarCombobox(Container c) {
		// TODO Auto-generated method stub

	}
}
