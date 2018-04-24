package guijava;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class form2 {

	protected Shell shell;
	private Text txtUrl;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			form2 window = new form2();
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
		
		txtUrl = new Text(shell, SWT.BORDER);
		txtUrl.setBounds(41, 7, 372, 21);
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setBounds(10, 10, 55, 15);
		lblNewLabel.setText("Url:");
		
		Browser bwsUrl = new Browser(shell, SWT.NONE);
		bwsUrl.setBounds(10, 67, 403, 173);
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				bwsUrl.back();
			}
		});
		btnNewButton.setBounds(227, 36, 75, 25);
		btnNewButton.setText("Retroceder");
		
		Button btnIr = new Button(shell, SWT.NONE);
		btnIr.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				bwsUrl.setUrl(txtUrl.getText());
			}
		});
		btnIr.setText("Ir");
		btnIr.setBounds(10, 36, 75, 25);
		
		Button btnActualizar = new Button(shell, SWT.NONE);
		btnActualizar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				bwsUrl.refresh();
			}
		});
		btnActualizar.setText("Actualizar");
		btnActualizar.setBounds(117, 36, 75, 25);
		
		Button btnAvanzar = new Button(shell, SWT.NONE);
		btnAvanzar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				bwsUrl.forward();
			}
		});
		btnAvanzar.setText("Avanzar");
		btnAvanzar.setBounds(338, 34, 75, 25);

	}
}
