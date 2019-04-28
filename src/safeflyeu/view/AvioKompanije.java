/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safeflyeu.view;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import safeflyeu.controller.ObradaAvioKompanija;
import safeflyeu.controller.ObradaKorisnik;
import safeflyeu.controller.ObradaKorisnik_AvioKompanija;
import safeflyeu.controller.ObradaOsiguranje;
import safeflyeu.controller.ObradaZaposlenik;
import safeflyeu.model.AvioKompanija;
import safeflyeu.model.Korisnik;
import safeflyeu.model.Korisnik_AvioKompanija;
import safeflyeu.model.Osiguranje;
import safeflyeu.model.Zaposlenik;
import safeflyeu.pomocno.SafeFlyEUException;

/**
 *
 * @author labak
 */
public class AvioKompanije extends javax.swing.JFrame {

    private final ObradaAvioKompanija obradaEntitet;
    private final ObradaKorisnik obradaKorisnik;
    private final ObradaKorisnik_AvioKompanija obradaKorisnik_AvioKompanija;
    private static DefaultComboBoxModel<Osiguranje> modelOsiguranje;
    private static DefaultComboBoxModel<Zaposlenik> modelZaposlenik;
    private AvioKompanija avioKompanija;

    /**
     * Creates new form AvioKompanija
     */
    public AvioKompanije() {
        initComponents();
        obradaEntitet = new ObradaAvioKompanija();
        obradaKorisnik = new ObradaKorisnik();
        obradaKorisnik_AvioKompanija = new ObradaKorisnik_AvioKompanija();

        DefaultComboBoxModel<Osiguranje> os = new DefaultComboBoxModel<>();
        Osiguranje o = new Osiguranje();
        o.setId(0);
        o.setNaziv("Odaberite osiguranje");
        os.addElement(o);
        new ObradaOsiguranje().getLista().forEach((s) -> {
            os.addElement(s);
        });
        cmbOsiguranja.setModel(os);

        DefaultComboBoxModel<Zaposlenik> za = new DefaultComboBoxModel<>();
        Zaposlenik z = new Zaposlenik();
        z.setId(0);
        z.setIme("Odaberite zaposlenika");
        za.addElement(z);
        new ObradaZaposlenik().getLista().forEach((s) -> {
            za.addElement(s);
        });
        cmbZaposlenici.setModel(za);

        ucitajPodatke();
    }

    private void ucitajPodatke() {
        DefaultListModel<AvioKompanija> m = new DefaultListModel<>();
        try {

            obradaEntitet.getLista().forEach((ak) -> {
                m.addElement(ak);
            });

            lstEntiteti.setModel(m);

        } catch (Exception e) {
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtIban = new javax.swing.JTextField();
        txtLet = new javax.swing.JTextField();
        txtOib = new javax.swing.JTextField();
        btnExit = new javax.swing.JButton();
        txtNaziv = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstEntiteti = new javax.swing.JList<>();
        btnDodaj = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnPromjena = new javax.swing.JButton();
        txtAvion = new javax.swing.JTextField();
        btnBrisanje = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cmbOsiguranja = new javax.swing.JComboBox<>();
        cmbZaposlenici = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstKorisnikaUBazi = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstKorisnikaUAvioKompaniji = new javax.swing.JList<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnDodajNaAvioKompaniju = new javax.swing.JButton();
        btnMakniSaAvioKompanije = new javax.swing.JButton();
        txtUvjet = new javax.swing.JTextField();
        chbLimitator = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        chbHrana = new javax.swing.JCheckBox();
        chbPice = new javax.swing.JCheckBox();
        chbPrtljaga = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        txtOznakaSjedala = new javax.swing.JTextField();
        btnIspisi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Avio-Kompanije");
        setUndecorated(true);

        txtLet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLetKeyReleased(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        lstEntiteti.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstEntitetiValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstEntiteti);

        btnDodaj.setText("Dodaj");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Aharoni", 1, 18)); // NOI18N
        jLabel1.setText("Avio-kompanije");

        jLabel2.setText("Naziv");

        jLabel3.setText("Osiguranje");

        jLabel5.setText("Iban");

        jLabel6.setText("Avion");

        jLabel7.setText("Let");

        jLabel8.setText("Oib");

        btnPromjena.setText("Promjena");
        btnPromjena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjenaActionPerformed(evt);
            }
        });

        btnBrisanje.setText("Brisanje");
        btnBrisanje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrisanjeActionPerformed(evt);
            }
        });

        jLabel4.setText("Zaposlenik");

        jScrollPane2.setViewportView(lstKorisnikaUBazi);

        jScrollPane3.setViewportView(lstKorisnikaUAvioKompaniji);

        jLabel9.setText("Korisnici u bazi:");

        jLabel10.setText("Korisnici Avio-kompanije:");

        btnDodajNaAvioKompaniju.setText(">>>");
        btnDodajNaAvioKompaniju.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajNaAvioKompanijuActionPerformed(evt);
            }
        });

        btnMakniSaAvioKompanije.setText("<<<");
        btnMakniSaAvioKompanije.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMakniSaAvioKompanijeActionPerformed(evt);
            }
        });

        txtUvjet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUvjetActionPerformed(evt);
            }
        });
        txtUvjet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUvjetKeyReleased(evt);
            }
        });

        chbLimitator.setSelected(true);
        chbLimitator.setText("Limitiraj na 50 rezultata");
        chbLimitator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbLimitatorActionPerformed(evt);
            }
        });

        jLabel11.setText("Dodaj korisnika:");

        jLabel12.setText("Ukloni korisnika:");

        chbHrana.setText("Hrana");
        chbHrana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbHranaActionPerformed(evt);
            }
        });

        chbPice.setText("Piće");
        chbPice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbPiceActionPerformed(evt);
            }
        });

        chbPrtljaga.setText("Prtljaga");
        chbPrtljaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbPrtljagaActionPerformed(evt);
            }
        });

        jLabel13.setText("Oznaka sjedala:");

        btnIspisi.setText("Ispiši");
        btnIspisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIspisiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cmbZaposlenici, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cmbOsiguranja, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtAvion)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtIban)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtOib)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNaziv)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4)
                                        .addComponent(txtLet, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnPromjena)
                                .addGap(19, 19, 19)
                                .addComponent(btnBrisanje, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chbHrana, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chbPice)
                                    .addComponent(chbPrtljaga))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(txtOznakaSjedala, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtUvjet, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chbLimitator)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnMakniSaAvioKompanije, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnDodajNaAvioKompaniju, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel12))
                                    .addComponent(btnIspisi, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(141, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAvion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(jLabel7)
                                .addGap(2, 2, 2)
                                .addComponent(txtLet, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIban, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtOib, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbOsiguranja, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbZaposlenici, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBrisanje)
                            .addComponent(btnPromjena)
                            .addComponent(btnDodaj))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                        .addComponent(btnExit)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUvjet, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(chbLimitator)
                                        .addComponent(jLabel10)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(82, 82, 82)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnDodajNaAvioKompaniju)
                                        .addGap(39, 39, 39)
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnMakniSaAvioKompanije)
                                        .addGap(33, 33, 33)
                                        .addComponent(btnIspisi))))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chbHrana)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chbPice)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chbPrtljaga)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtOznakaSjedala, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                                .addGap(118, 118, 118))))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtLetKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLetKeyReleased
        //if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        //ucitajKorisnike(avioKompanija);
        // }
    }//GEN-LAST:event_txtLetKeyReleased

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        AvioKompanija ak = new AvioKompanija();
        ak = preuzmiVrijednosti(ak);
        save(ak);

    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnPromjenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjenaActionPerformed
        avioKompanija = lstEntiteti.getSelectedValue();
        if (avioKompanija == null) {
            JOptionPane.showMessageDialog(null, "Prvo odaberite avio kompaniju");
            return;
        }
        avioKompanija = preuzmiVrijednosti(avioKompanija);
        save(avioKompanija);
    }//GEN-LAST:event_btnPromjenaActionPerformed

    private void btnBrisanjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrisanjeActionPerformed

        avioKompanija = lstEntiteti.getSelectedValue();

        if (avioKompanija == null) {
            JOptionPane.showConfirmDialog(null, "Prvo odaberite avio kompaniju");
        }

        try {
            obradaEntitet.obrisi(avioKompanija);
            ucitajPodatke();
            ocistiPolja();
        } catch (SafeFlyEUException ex) {
            JOptionPane.showMessageDialog(null, "Ne mogu obrisati");
        }


    }//GEN-LAST:event_btnBrisanjeActionPerformed

    private void lstEntitetiValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstEntitetiValueChanged
        if (evt.getValueIsAdjusting()) {
            return;
        }

        ocistiPolja();

        avioKompanija = lstEntiteti.getSelectedValue();

        if (avioKompanija == null) {
            return;
        }

        txtNaziv.setText(avioKompanija.getNaziv());
        txtAvion.setText(avioKompanija.getAvion());
        txtIban.setText(avioKompanija.getIban());
        txtLet.setText(avioKompanija.getLet());
        txtOib.setText(avioKompanija.getOib());
        cmbOsiguranja.setSelectedItem(avioKompanija.getOsiguranje());
        cmbZaposlenici.setSelectedItem(avioKompanija.getZaposlenik());

        modelOsiguranje = (DefaultComboBoxModel<Osiguranje>) cmbOsiguranja.getModel();
        for (int i = 0; i < modelOsiguranje.getSize(); i++) {
            if (modelOsiguranje.getElementAt(i).getId() == avioKompanija.getOsiguranje().getId()) {
                cmbOsiguranja.setSelectedIndex(i);
                //break;
            }
        }

        modelZaposlenik = (DefaultComboBoxModel<Zaposlenik>) cmbZaposlenici.getModel();
        for (int i = 0; i < modelZaposlenik.getSize(); i++) {
            if (modelZaposlenik.getElementAt(i).getId() == avioKompanija.getZaposlenik().getId()) {
                cmbZaposlenici.setSelectedIndex(i);
                //break;
            }
        }
        //preuzmiVrijednosti(avioKompanija);
        ucitajKorisnike(avioKompanija);
    }//GEN-LAST:event_lstEntitetiValueChanged

    private void btnMakniSaAvioKompanijeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMakniSaAvioKompanijeActionPerformed
        if (avioKompanija == null) {
            JOptionPane.showMessageDialog(null, "Prvo odaberite avio kompaniju");
            return;
        }
        if (lstKorisnikaUAvioKompaniji.getSelectedValue() == null) {
            JOptionPane.showMessageDialog(null, "Odaberite korisnika kojega želite vratiti");
            return;
        }

        List<Integer> zaBrisanje = new ArrayList<>();
        lstKorisnikaUAvioKompaniji.getSelectedValuesList().forEach((p) -> {
            zaBrisanje.add(p.getId());
        });

        for (int i = 0; i < avioKompanija.getKorisnik().size(); i++) {
            for (int b : zaBrisanje) {
                if (avioKompanija.getKorisnik().get(i).getId() == b) {
                    avioKompanija.getKorisnik().remove(i);
                    break;
                }
            }
        }

        ucitajKorisnike(avioKompanija);
    }//GEN-LAST:event_btnMakniSaAvioKompanijeActionPerformed

    private void btnDodajNaAvioKompanijuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajNaAvioKompanijuActionPerformed
        if (avioKompanija == null) {
            JOptionPane.showMessageDialog(null, "Prvo odaberite avio kompaniju");
            return;
        }
        if (lstKorisnikaUBazi.getSelectedValue() == null) {
            JOptionPane.showMessageDialog(null, "Odaberite korisnika iz baze");
            return;
        }
        
        //Korisnik_AvioKompanija kak = new Korisnik_AvioKompanija();
        
        lstKorisnikaUBazi.getSelectedValuesList().forEach((p) -> {

            boolean postoji = false;
            for (int i = 0; i < lstKorisnikaUAvioKompaniji.getModel().getSize(); i++) {
                if (p.getId() == lstKorisnikaUAvioKompaniji.getModel().getElementAt(i).getId()) {
                    postoji = true;
                    break;
                }
            }
            if (!postoji) {
                avioKompanija.getKorisnik().add(p);
                //p.getGrupe().add(grupa);
            }

        });
        //preuzmiVrijednostiVezneTablice(kak);
        ucitajKorisnike(avioKompanija);

    }//GEN-LAST:event_btnDodajNaAvioKompanijuActionPerformed

    private void txtUvjetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUvjetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUvjetActionPerformed

    private void txtUvjetKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUvjetKeyReleased
        //if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        ucitajKorisnike();
        // }
    }//GEN-LAST:event_txtUvjetKeyReleased

    private void ucitajKorisnike() {
        if (chbLimitator.isSelected()) {
            DefaultListModel<Korisnik> m = new DefaultListModel<>();
            for (Korisnik s : obradaKorisnik.getLista(txtUvjet.getText().trim(), chbLimitator.isSelected())) {
                m.addElement(s);
            }
            lstKorisnikaUBazi.setModel(m);
        } else {
            DefaultListModel<Korisnik> m = new DefaultListModel<>();
            Korisnik k = new Korisnik();
            k.setIme("Molim");
            k.setPrezime("pričekati");
            m.addElement(k);
            lstKorisnikaUBazi.setModel(m);
            AvioKompanije.DuzeUcitanjeKorisnika d = new AvioKompanije.DuzeUcitanjeKorisnika();
            d.start();
        }
    }

    private class DuzeUcitanjeKorisnika extends Thread {

        @Override
        public void run() {
            DefaultListModel<Korisnik> m = new DefaultListModel<>();
            for (Korisnik s : obradaKorisnik.getLista(txtUvjet.getText().trim(), chbLimitator.isSelected())) {
                m.addElement(s);
            }
            lstKorisnikaUBazi.setModel(m);
        }

    }

    private void chbLimitatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbLimitatorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbLimitatorActionPerformed

    private void chbHranaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbHranaActionPerformed

    }//GEN-LAST:event_chbHranaActionPerformed

    private void chbPiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbPiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbPiceActionPerformed

    private void chbPrtljagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbPrtljagaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbPrtljagaActionPerformed

    private void btnIspisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIspisiActionPerformed
        
    }//GEN-LAST:event_btnIspisiActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrisanje;
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnDodajNaAvioKompaniju;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnIspisi;
    private javax.swing.JButton btnMakniSaAvioKompanije;
    private javax.swing.JButton btnPromjena;
    private javax.swing.JCheckBox chbHrana;
    private javax.swing.JCheckBox chbLimitator;
    private javax.swing.JCheckBox chbPice;
    private javax.swing.JCheckBox chbPrtljaga;
    private javax.swing.JComboBox<Osiguranje> cmbOsiguranja;
    private javax.swing.JComboBox<Zaposlenik> cmbZaposlenici;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<AvioKompanija> lstEntiteti;
    private javax.swing.JList<Korisnik> lstKorisnikaUAvioKompaniji;
    private javax.swing.JList<Korisnik> lstKorisnikaUBazi;
    private javax.swing.JTextField txtAvion;
    private javax.swing.JTextField txtIban;
    private javax.swing.JTextField txtLet;
    private javax.swing.JTextField txtNaziv;
    private javax.swing.JTextField txtOib;
    private javax.swing.JTextField txtOznakaSjedala;
    private javax.swing.JTextField txtUvjet;
    // End of variables declaration//GEN-END:variables

    private void ocistiPolja() {
        txtNaziv.setText("");
        cmbOsiguranja.setSelectedIndex(0);
        cmbZaposlenici.setSelectedIndex(0);
        txtAvion.setText("");
        txtLet.setText("");
        txtOib.setText("");
        txtIban.setText("");

    }

    private void save(AvioKompanija ak) {
        try {
            obradaEntitet.save(ak);
            ocistiPolja();
            ucitajPodatke();
        } catch (SafeFlyEUException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    private void preuzmiVrijednostiVezneTablice (Korisnik_AvioKompanija kak) {
        kak.setHrana(chbHrana.isSelected());
        kak.setPice(chbPice.isSelected());
        kak.setPrtljaga(chbPrtljaga.isSelected());
        kak.setOznakaSjedala(txtOznakaSjedala.getText());
    }

    private AvioKompanija preuzmiVrijednosti(AvioKompanija ak) {
        ak.setNaziv(txtNaziv.getText());
        ak.setAvion(txtAvion.getText());
        ak.setIban(txtIban.getText());
        ak.setLet(txtLet.getText());
        ak.setOib(txtOib.getText());
        ak.setOsiguranje((Osiguranje) cmbOsiguranja.getSelectedItem());
        ak.setZaposlenik((Zaposlenik) cmbZaposlenici.getSelectedItem());

        return ak;

    }

//    private void save(AvioKompanija entitet) {
//        try {
//            obradaEntitet.save(entitet);
//            ocistiPolja();
//            ucitajPodatke();
//        } catch (SafeFlyEUException e) {
//            JOptionPane.showMessageDialog(null, e.getMessage());
//        }
//    }
    private void ucitajKorisnike(AvioKompanija ak) {
        DefaultListModel<Korisnik> m = new DefaultListModel<>();

        ak.getKorisnik().forEach((p) -> {

            m.addElement(p);

        });
        lstKorisnikaUAvioKompaniji.setModel(m);
    }
}
