/*
* Copyright 2011 BetaSteward_at_googlemail.com. All rights reserved.
*
* Redistribution and use in source and binary forms, with or without modification, are
* permitted provided that the following conditions are met:
*
*    1. Redistributions of source code must retain the above copyright notice, this list of
*       conditions and the following disclaimer.
*
*    2. Redistributions in binary form must reproduce the above copyright notice, this list
*       of conditions and the following disclaimer in the documentation and/or other materials
*       provided with the distribution.
*
* THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com ``AS IS'' AND ANY EXPRESS OR IMPLIED
* WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
* FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
* CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
* CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
* SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
* ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
* NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
* ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*
* The views and conclusions contained in the software and documentation are those of the
* authors and should not be interpreted as representing official policies, either expressed
* or implied, of BetaSteward_at_googlemail.com.
*/

/*
 * ConsolePanel.java
 *
 * Created on 14-May-2011, 6:08:48 PM
 */
package mage.server.console;

import java.util.Collection;
import java.util.List;
import java.util.UUID;
import javax.swing.SwingWorker;
import javax.swing.table.AbstractTableModel;
import mage.server.console.remote.Session;
import mage.view.TableView;
import mage.view.UserView;

/**
 *
 * @author BetaSteward_at_googlemail.com
 */
public class ConsolePanel extends javax.swing.JPanel {

	private TableUserModel tableUserModel;
	private TableTableModel tableTableModel;
	private UpdateUsersTask updateUsersTask;
	private UpdateTablesTask updateTablesTask;

	/** Creates new form ConsolePanel */
	public ConsolePanel() {
		this.tableUserModel = new TableUserModel();
		this.tableTableModel = new TableTableModel();
		initComponents();
		this.tblUsers.createDefaultColumnsFromModel();
		this.tblTables.createDefaultColumnsFromModel();
	}

	public void update(List<UserView> users) {
		int row = this.tblUsers.getSelectedRow();
		tableUserModel.loadData(users);
		this.tblUsers.repaint();
		this.tblUsers.getSelectionModel().setSelectionInterval(row, row);
	}
	
	public void update(Collection<TableView> tables) {
		int row = this.tblTables.getSelectedRow();
		tableTableModel.loadData(tables);
		this.tblTables.repaint();
		this.tblTables.getSelectionModel().setSelectionInterval(row, row);
	}
	
	
	public void start() {
		updateUsersTask = new UpdateUsersTask(ConsoleFrame.getSession(), this);
		updateTablesTask = new UpdateTablesTask(ConsoleFrame.getSession(), ConsoleFrame.getSession().getMainRoomId(), this);
		updateUsersTask.execute();
		updateTablesTask.execute();
	}
	
	public void stop() {
		if (updateUsersTask != null && !updateUsersTask.isDone())
			updateUsersTask.cancel(true);
		if (updateTablesTask != null && !updateTablesTask.isDone())
			updateTablesTask.cancel(true);
	}
	
	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsers = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btnDisconnect = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTables = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();

        jSplitPane1.setDividerLocation(250);
        jSplitPane1.setResizeWeight(0.5);

        tblUsers.setModel(tableUserModel);
        jScrollPane1.setViewportView(tblUsers);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
        );

        jPanel4.setVerifyInputWhenFocusTarget(false);

        btnDisconnect.setText("Disconnect");
        btnDisconnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisconnectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(btnDisconnect)
                .addContainerGap(164, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(btnDisconnect)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        tblTables.setModel(tableTableModel);
        jScrollPane2.setViewportView(tblTables);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
        );

        btnDelete.setText("Remove");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(btnDelete)
                .addContainerGap(235, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(btnDelete)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jSplitPane1.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

	private void btnDisconnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisconnectActionPerformed
		int row = this.tblUsers.getSelectedRow();
		ConsoleFrame.getSession().disconnectUser((UUID)tableUserModel.getValueAt(row, 3));
	}//GEN-LAST:event_btnDisconnectActionPerformed

	private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
		int row = this.tblTables.getSelectedRow();
		ConsoleFrame.getSession().removeTable((UUID)tableTableModel.getValueAt(row, 7));
	}//GEN-LAST:event_btnDeleteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDisconnect;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTable tblTables;
    private javax.swing.JTable tblUsers;
    // End of variables declaration//GEN-END:variables
}

class TableUserModel extends AbstractTableModel {
    private String[] columnNames = new String[]{"User Name", "Host", "Time Connected"};
	private UserView[] users = new UserView[0];

	public void loadData(List<UserView> users) {
		this.users = users.toArray(new UserView[0]);
		this.fireTableDataChanged();
	}

	@Override
	public int getRowCount() {
		return users.length;
	}

	@Override
	public int getColumnCount() {
		return columnNames.length;
	}

	@Override
	public Object getValueAt(int arg0, int arg1) {
		switch (arg1) {
			case 0:
				return users[arg0].getUserName();
			case 1:
				return users[arg0].getHost();
			case 2:
				return users[arg0].getConnectionTime().toString();
			case 3:
				return users[arg0].getSessionId();
		}
		return "";
	}

	@Override
	public String getColumnName(int columnIndex) {
        String colName = "";

        if (columnIndex <= getColumnCount())
            colName = columnNames[columnIndex];

        return colName;
    }

	@Override
    public Class getColumnClass(int columnIndex){
		return String.class;
    }

	@Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
		return false;
    }

}

class TableTableModel extends AbstractTableModel {
    private String[] columnNames = new String[]{"Table Name", "Owner", "Game Type", "Deck Type", "Status"};
	private TableView[] tables = new TableView[0];


	public void loadData(Collection<TableView> tables) {
		this.tables = tables.toArray(new TableView[0]);
		this.fireTableDataChanged();
	}

	@Override
	public int getRowCount() {
		return tables.length;
	}

	@Override
	public int getColumnCount() {
		return columnNames.length;
	}

	@Override
	public Object getValueAt(int arg0, int arg1) {
		switch (arg1) {
			case 0:
				return tables[arg0].getTableName();
			case 1:
				return tables[arg0].getControllerName();
			case 2:
				return tables[arg0].getGameType().toString();
			case 3:
				return tables[arg0].getDeckType().toString();
			case 4:
				return tables[arg0].getTableState().toString();
			case 5:
				return tables[arg0].isTournament();
			case 6:
				if (!tables[arg0].getGames().isEmpty())
					return tables[arg0].getGames().get(0);
				return null;
			case 7:
				return tables[arg0].getTableId();
		}
		return "";
	}

	@Override
	public String getColumnName(int columnIndex) {
        String colName = "";

        if (columnIndex <= getColumnCount())
            colName = columnNames[columnIndex];

        return colName;
    }

	@Override
    public Class getColumnClass(int columnIndex){
		return String.class;
    }

	@Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
		if (columnIndex != 5)
			return false;
		return true;
    }

}

class UpdateUsersTask extends SwingWorker<Void, List<UserView>> {

	private Session session;
	private ConsolePanel panel;

	UpdateUsersTask(Session session, ConsolePanel panel) {
		this.session = session;
		this.panel = panel;
	}

	@Override
	protected Void doInBackground() throws Exception {
		while (!isCancelled()) {
			this.publish(session.getUsers());
			Thread.sleep(1000);
		}
		return null;
	}

	@Override
	protected void process(List<List<UserView>> view) {
		panel.update(view.get(0));
	}

}

class UpdateTablesTask extends SwingWorker<Void, Collection<TableView>> {

	private Session session;
	private UUID roomId;
	private ConsolePanel panel;

	UpdateTablesTask(Session session, UUID roomId, ConsolePanel panel) {
		this.session = session;
		this.roomId = roomId;
		this.panel = panel;
	}

	@Override
	protected Void doInBackground() throws Exception {
		while (!isCancelled()) {
			this.publish(session.getTables(roomId));
			Thread.sleep(1000);
		}
		return null;
	}

	@Override
	protected void process(List<Collection<TableView>> view) {
		panel.update(view.get(0));
	}

}