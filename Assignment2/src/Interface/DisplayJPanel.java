/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import modal.Education;
import modal.Resume;
import modal.Work_Exp;

/**
 *
 * @author omkar
 */
public class DisplayJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DisplayJPanel
     */
    ArrayList<Resume> resume;
    DefaultTableModel dtm;
    
    public DisplayJPanel(ArrayList<Resume> r) {
        this.resume = r;
        initComponents();
        jLabel3.setVisible(false);
        String header[] = new String[]{"Name", "Designation"};
        dtm = new DefaultTableModel(0, 0);
        dtm.setColumnIdentifiers(header);
        
        resumeTable.setModel(dtm);
        
        for (int i = 0; i < r.size(); i++) {
            String name = r.get(i).getName();
            String desg = r.get(i).getDesg();
            dtm.addRow(new Object[]{name, desg});
        }
        
        resumeTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                // do some actions here, for example
                // print first column value from selected row
                int index = resumeTable.getSelectedRow();
                
                Resume temp = resume.get(index);
                
                nameTextField.setText(temp.getName());
                designationTextField.setText(temp.getName());
                addTextArea.setText(temp.getAddress1());
                dobTextField.setText(temp.getDob());
                affiliationTextField.setText(temp.getAffilation());
                phoneTextField.setText(temp.getPhne());
                genderTextField.setText(temp.getGender());
                joiningTextField.setText(temp.getJoining());
                
                try {
                    ImageIcon icon = new ImageIcon(temp.getImage_path());
                    phoneLabel.setIcon(icon);
                } catch (Exception ex) {
                    
                    ex.printStackTrace();
                    
                }
                ArrayList<Work_Exp> work = temp.getWork();
                if (work.size() == 0) {
                    jLabel3.setText("Fresher");
                    jLabel3.setVisible(true);
                    workPanel.setVisible(false);
                } else {
                    org1TextField.setText(work.get(0).getCompany());
                    degree1TextField1.setText(work.get(0).getDesg());
                    gpa1TextField1.setText(work.get(0).getDuration());
                    
                    if (work.size() == 2) {
                        org2TextField.setText(work.get(1).getCompany());
                        degree2TextField1.setText(work.get(1).getDesg());
                        gpa2TextField1.setText(work.get(1).getDuration());
                        
                    }
                }
                
                ArrayList<Education> edu = temp.getEdu();
                coll1TextField.setText(edu.get(0).getSchool());
                degree1TextField.setText(edu.get(0).getDegree());
                gpa1TextField.setText(edu.get(0).getGpa() + "");
                passingTextField.setText(edu.get(0).getMonth_Year());
                
                if (edu.size() == 2) {
                    coll2TextField.setText(edu.get(1).getSchool());
                    degree2TextField.setText(edu.get(1).getDegree());
                    gpa2TextField.setText(edu.get(1).getGpa() + "");
                    jTextField6.setText(edu.get(1).getMonth_Year());
                }
                
                ArrayList skills = temp.getSkills();
                jList1.setListData(skills.toArray());
                
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headingLabel = new javax.swing.JLabel();
        resumeScrollPane = new javax.swing.JScrollPane();
        resumeTable = new javax.swing.JTable();
        nameTextField = new javax.swing.JTextField();
        nameLable = new javax.swing.JLabel();
        addBtn = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        addTextArea = new javax.swing.JTextArea();
        affiliationLabel = new javax.swing.JLabel();
        affiliationTextField = new javax.swing.JTextField();
        phoneLabel = new javax.swing.JLabel();
        phoneTextField = new javax.swing.JTextField();
        photoLabel = new javax.swing.JLabel();
        designationTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dobTextField = new javax.swing.JTextField();
        educationPanel = new javax.swing.JPanel();
        collegeLabel1 = new javax.swing.JLabel();
        collegeLabel = new javax.swing.JLabel();
        coll1TextField = new javax.swing.JTextField();
        coll2TextField = new javax.swing.JTextField();
        degree1Label = new javax.swing.JLabel();
        degree2Label = new javax.swing.JLabel();
        degree1TextField = new javax.swing.JTextField();
        degree2TextField = new javax.swing.JTextField();
        gpa1Label = new javax.swing.JLabel();
        gpa2label = new javax.swing.JLabel();
        gpa1TextField = new javax.swing.JTextField();
        gpa2TextField = new javax.swing.JTextField();
        passing1Label = new javax.swing.JLabel();
        passing2Label = new javax.swing.JLabel();
        passingTextField = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        workPanel = new javax.swing.JPanel();
        organisation1Label = new javax.swing.JLabel();
        organisation2Label = new javax.swing.JLabel();
        org1TextField = new javax.swing.JTextField();
        org2TextField = new javax.swing.JTextField();
        duration1Label = new javax.swing.JLabel();
        duration2Label = new javax.swing.JLabel();
        degree1TextField1 = new javax.swing.JTextField();
        degree2TextField1 = new javax.swing.JTextField();
        designation1Label = new javax.swing.JLabel();
        designation2Label = new javax.swing.JLabel();
        gpa1TextField1 = new javax.swing.JTextField();
        gpa2TextField1 = new javax.swing.JTextField();
        deleteBtn = new javax.swing.JButton();
        radioPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        joiningLabel = new javax.swing.JLabel();
        genderTextField = new javax.swing.JTextField();
        joiningTextField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();

        headingLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headingLabel.setText("Resume");

        resumeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Designation"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        resumeScrollPane.setViewportView(resumeTable);

        nameTextField.setEditable(false);

        nameLable.setText("Name");

        addBtn.setText("Address");

        addTextArea.setEditable(false);
        addTextArea.setColumns(20);
        addTextArea.setRows(5);
        jScrollPane1.setViewportView(addTextArea);

        affiliationLabel.setText("Affiliation");

        affiliationTextField.setEditable(false);

        phoneLabel.setText("Phone no");

        phoneTextField.setEditable(false);

        photoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        designationTextField.setEditable(false);

        jLabel1.setText("Designation");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DOB");

        dobTextField.setEditable(false);

        educationPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        collegeLabel1.setText("College 1");

        collegeLabel.setText("College 2");

        coll1TextField.setEditable(false);

        coll2TextField.setEditable(false);

        degree1Label.setText("Degree 1");

        degree2Label.setText("Degree 2");

        degree1TextField.setEditable(false);

        degree2TextField.setEditable(false);

        gpa1Label.setText("GPA");

        gpa2label.setText("GPA");

        gpa1TextField.setEditable(false);
        gpa1TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gpa1TextFieldActionPerformed(evt);
            }
        });

        gpa2TextField.setEditable(false);

        passing1Label.setText("Passing");

        passing2Label.setText("Passing");

        passingTextField.setEditable(false);

        jTextField6.setEditable(false);

        javax.swing.GroupLayout educationPanelLayout = new javax.swing.GroupLayout(educationPanel);
        educationPanel.setLayout(educationPanelLayout);
        educationPanelLayout.setHorizontalGroup(
            educationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(educationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(educationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(collegeLabel1)
                    .addComponent(collegeLabel))
                .addGap(28, 28, 28)
                .addGroup(educationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(coll1TextField)
                    .addComponent(coll2TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(educationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(degree1Label)
                    .addComponent(degree2Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(educationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(degree1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(degree2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(educationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(gpa2label)
                    .addComponent(gpa1Label))
                .addGap(27, 27, 27)
                .addGroup(educationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gpa1TextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gpa2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(educationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passing1Label)
                    .addComponent(passing2Label))
                .addGap(47, 47, 47)
                .addGroup(educationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passingTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        educationPanelLayout.setVerticalGroup(
            educationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(educationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(educationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(collegeLabel1)
                    .addComponent(coll1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(degree1Label)
                    .addComponent(degree1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gpa1Label)
                    .addComponent(gpa1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passing1Label)
                    .addComponent(passingTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(educationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(collegeLabel)
                    .addComponent(coll2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(degree2Label)
                    .addComponent(degree2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gpa2label)
                    .addComponent(gpa2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passing2Label)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        workPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Experience"));

        organisation1Label.setText("Organization");

        organisation2Label.setText("Organization");

        org1TextField.setEditable(false);

        org2TextField.setEditable(false);

        duration1Label.setText("Duration");

        duration2Label.setText("Duration");

        degree1TextField1.setEditable(false);

        degree2TextField1.setEditable(false);

        designation1Label.setText("Designation");

        designation2Label.setText("Designation");

        gpa1TextField1.setEditable(false);
        gpa1TextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gpa1TextField1ActionPerformed(evt);
            }
        });

        gpa2TextField1.setEditable(false);

        javax.swing.GroupLayout workPanelLayout = new javax.swing.GroupLayout(workPanel);
        workPanel.setLayout(workPanelLayout);
        workPanelLayout.setHorizontalGroup(
            workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(organisation1Label)
                    .addComponent(organisation2Label))
                .addGap(28, 28, 28)
                .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(org1TextField)
                    .addComponent(org2TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(duration1Label)
                    .addComponent(duration2Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(degree1TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(degree2TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(designation2Label)
                    .addComponent(designation1Label))
                .addGap(27, 27, 27)
                .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gpa1TextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gpa2TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        workPanelLayout.setVerticalGroup(
            workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(organisation1Label)
                    .addComponent(org1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(duration1Label)
                    .addComponent(degree1TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(designation1Label)
                    .addComponent(gpa1TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(organisation2Label)
                    .addComponent(org2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(duration2Label)
                    .addComponent(degree2TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(designation2Label)
                    .addComponent(gpa2TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        radioPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel3.setText("Experienced");

        genderLabel.setText("Gender");

        joiningLabel.setText("Joining");

        genderTextField.setEditable(false);

        joiningTextField.setEditable(false);

        javax.swing.GroupLayout radioPanelLayout = new javax.swing.GroupLayout(radioPanel);
        radioPanel.setLayout(radioPanelLayout);
        radioPanelLayout.setHorizontalGroup(
            radioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(radioPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(radioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(radioPanelLayout.createSequentialGroup()
                        .addComponent(genderLabel)
                        .addGap(18, 18, 18)
                        .addComponent(genderTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(110, 110, 110)
                .addComponent(joiningLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(joiningTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );
        radioPanelLayout.setVerticalGroup(
            radioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(radioPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(radioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderLabel)
                    .addComponent(joiningLabel)
                    .addComponent(genderTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(joiningTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        jList1.setBorder(javax.swing.BorderFactory.createTitledBorder("Skills"));
        jList1.setEnabled(false);
        jScrollPane2.setViewportView(jList1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLable)
                    .addComponent(affiliationLabel)
                    .addComponent(phoneLabel)
                    .addComponent(addBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(workPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(phoneTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(affiliationTextField, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(radioPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(54, 54, 54)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(31, 31, 31)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(designationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(dobTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(resumeScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(photoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(headingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(deleteBtn))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(educationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(28, 28, 28))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(deleteBtn)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(76, 76, 76)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(nameLable)
                                            .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1)
                                            .addComponent(designationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(38, 38, 38)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(addBtn)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel2)
                                                .addComponent(dobTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(247, 247, 247)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(affiliationLabel)
                                            .addComponent(affiliationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(23, 23, 23))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(photoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(headingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(resumeScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLabel)
                    .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(educationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(workPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void gpa1TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gpa1TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gpa1TextFieldActionPerformed

    private void gpa1TextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gpa1TextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gpa1TextField1ActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        resume.remove(resumeTable.getSelectedRow());
        dtm.removeRow(resumeTable.getSelectedRow());
    }//GEN-LAST:event_deleteBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addBtn;
    private javax.swing.JTextArea addTextArea;
    private javax.swing.JLabel affiliationLabel;
    private javax.swing.JTextField affiliationTextField;
    private javax.swing.JTextField coll1TextField;
    private javax.swing.JTextField coll2TextField;
    private javax.swing.JLabel collegeLabel;
    private javax.swing.JLabel collegeLabel1;
    private javax.swing.JLabel degree1Label;
    private javax.swing.JTextField degree1TextField;
    private javax.swing.JTextField degree1TextField1;
    private javax.swing.JLabel degree2Label;
    private javax.swing.JTextField degree2TextField;
    private javax.swing.JTextField degree2TextField1;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel designation1Label;
    private javax.swing.JLabel designation2Label;
    private javax.swing.JTextField designationTextField;
    private javax.swing.JTextField dobTextField;
    private javax.swing.JLabel duration1Label;
    private javax.swing.JLabel duration2Label;
    private javax.swing.JPanel educationPanel;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JTextField genderTextField;
    private javax.swing.JLabel gpa1Label;
    private javax.swing.JTextField gpa1TextField;
    private javax.swing.JTextField gpa1TextField1;
    private javax.swing.JTextField gpa2TextField;
    private javax.swing.JTextField gpa2TextField1;
    private javax.swing.JLabel gpa2label;
    private javax.swing.JLabel headingLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel joiningLabel;
    private javax.swing.JTextField joiningTextField;
    private javax.swing.JLabel nameLable;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField org1TextField;
    private javax.swing.JTextField org2TextField;
    private javax.swing.JLabel organisation1Label;
    private javax.swing.JLabel organisation2Label;
    private javax.swing.JLabel passing1Label;
    private javax.swing.JLabel passing2Label;
    private javax.swing.JTextField passingTextField;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JLabel photoLabel;
    private javax.swing.JPanel radioPanel;
    private javax.swing.JScrollPane resumeScrollPane;
    private javax.swing.JTable resumeTable;
    private javax.swing.JPanel workPanel;
    // End of variables declaration//GEN-END:variables
}
