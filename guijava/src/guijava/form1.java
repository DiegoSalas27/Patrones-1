package guijava;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Table;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class form1 {

	int i = 0;
	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			form1 window = new form1();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		shell.setLayout(new FormLayout());
		
		
		
		Menu menu = new Menu(shell, SWT.BAR);
		shell.setMenuBar(menu);
		
		MenuItem mntmArchivo_1 = new MenuItem(menu, SWT.CASCADE);
		mntmArchivo_1.setText("Archivo");
		
		Menu menu_4 = new Menu(mntmArchivo_1);
		mntmArchivo_1.setMenu(menu_4);
		
		MenuItem mntmNuevo = new MenuItem(menu_4, SWT.NONE);
		mntmNuevo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				form2 form = null;
				if(i == 0){
					form = new form2();
					i = i + 1;
					form.open();
				}	
			}
		});
		mntmNuevo.setText("Nuevo");
		
		MenuItem mntmAbrir = new MenuItem(menu_4, SWT.NONE);
		mntmAbrir.setText("Abrir");
		
		MenuItem mntmCerrar = new MenuItem(menu_4, SWT.NONE);
		mntmCerrar.setText("Cerrar");
		
		new MenuItem(menu_4, SWT.SEPARATOR);
		
		MenuItem mntmSalir = new MenuItem(menu_4, SWT.NONE);
		mntmSalir.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				shell.close();
			}
		});
		mntmSalir.setText("Salir");
		
		MenuItem mntmEdicin = new MenuItem(menu, SWT.CASCADE);
		mntmEdicin.setText("Edici\u00F3n");
		
		Menu menu_1 = new Menu(mntmEdicin);
		mntmEdicin.setMenu(menu_1);
		
		MenuItem mntmEditar = new MenuItem(menu_1, SWT.NONE);
		mntmEditar.setText("Editar");
		
		MenuItem mntmCopiar = new MenuItem(menu_1, SWT.NONE);
		mntmCopiar.setText("Copiar");
		
		MenuItem mntmPegar = new MenuItem(menu_1, SWT.NONE);
		mntmPegar.setText("Pegar");
		
		MenuItem mntmHerramientas = new MenuItem(menu, SWT.CASCADE);
		mntmHerramientas.setText("Herramientas");
		
		Menu menu_2 = new Menu(mntmHerramientas);
		mntmHerramientas.setMenu(menu_2);
		
		MenuItem mntmAcercaDe = new MenuItem(menu, SWT.CASCADE);
		mntmAcercaDe.setText("Acerca de");
		
		Menu menu_3 = new Menu(mntmAcercaDe);
		mntmAcercaDe.setMenu(menu_3);
		
		MenuItem mntmAyuda = new MenuItem(menu_3, SWT.NONE);
		mntmAyuda.setText("Ayuda");

	}
}
