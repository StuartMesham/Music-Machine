import javax.sound.midi.*;
import javax.swing.*;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stu
 */
public class InterfaceRandom extends javax.swing.JFrame {

    /**
     * Creates new form InterfaceRandom
     */
    public InterfaceRandom() {
        initComponents();
        try {
//            MidiSystem.write(sequence, 0, outputFile);
            sequencer = MidiSystem.getSequencer();
            sequencer.open();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        sequencer.setTempoFactor((float) jSlider1.getValue() / 60);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        generateButton = new javax.swing.JButton();
        playButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        jSlider1 = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Music Machine");

        generateButton.setText("Generate Sequence");
        generateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateButtonActionPerformed(evt);
            }
        });

        playButton.setText("Play");
        playButton.setEnabled(false);
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });

        saveButton.setText("Save");
        saveButton.setEnabled(false);
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        jSlider1.setMaximum(220);
        jSlider1.setMinimum(60);
        jSlider1.setPaintTicks(true);
        jSlider1.setValue(105);
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });

        jLabel1.setText("105bpm");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        jComboBox1.setSelectedIndex(2);

        jLabel2.setText("Beats Per Bar");

        jTextField1.setText("1; 5; 6; 4");

        jLabel3.setText("Chord Progression");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Major", "Minor" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(generateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSlider1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(playButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playButton)
                    .addComponent(saveButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(generateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    static int velocity = 90;
    int acsub = 16;
    Sequence sequence;
    Sequencer sequencer;
    MidiEvent tempoEvent;
    Track accompaniment;
    Track melody;

    private void generateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateButtonActionPerformed
        //32 ticks per crotchet
        try {
            sequence = new Sequence(Sequence.SMPTE_30, 1);
        } catch (InvalidMidiDataException ex) {
            ex.printStackTrace();
            System.exit(1);
        }

        accompaniment = sequence.createTrack();
        melody = sequence.createTrack();

        tempoEvent = createTempoEvent(jSlider1.getValue(), 0);
        accompaniment.add(tempoEvent);
        melody.add(tempoEvent);

        String[] chordsInput = jTextField1.getText().split(";");
        //int[] chords = {0, 4, 5, 3}; //First used 0, 4, 3, 5
        int[] chords = new int[chordsInput.length];
        for (int i = 0; i < chordsInput.length; i++) {
            chords[i] = Integer.parseInt(chordsInput[i].trim()) - 1;
        }
        int metre = Integer.parseInt((String) jComboBox1.getSelectedItem());
        boolean major = jComboBox2.getSelectedIndex() == 0;
        int barStart = 0;

        //Accompaniment
        int[] notes2 = {0, 2, 4, 7};
        int z = notes2.length;
        Note[] accompaniment2 = new Note[z];
        ArrayList<Note> accompaniment3 = new ArrayList<Note>();

        for (int i = 0; i < z; i++) {
            int acPos = 0;
            while (acPos < (32 * metre)/acsub) {
                //Put notes2 into random order
                int temp = random(i, notes2.length - 1);
                int temp2 = notes2[temp];
                notes2[temp] = notes2[i];
                notes2[i] = temp2;

                //Choose start of note
                int start = random(acPos, (32 * metre) / acsub - 1);
                int aVelocity = 30;
                if (start % 32 == 0) {
                    aVelocity = 50;
                }
                int end = random(start, (32 * metre) / acsub);
                //accompaniment2[i] = new Note(start * acsub, end, notes2[i], aVelocity);
                accompaniment3.add(new Note(start * acsub, end * acsub, notes2[i], aVelocity));
                System.out.println("Note added");
                acPos = end;
            }
        }

//        for (int i = 0; i < z; i++) {
//            //Put notes2 into random order
//            int temp = random(i, notes2.length - 1);
//            int temp2 = notes2[temp];
//            notes2[temp] = notes2[i];
//            notes2[i] = temp2;
//
//            //Choose start of note
//            int start = random(0, (32 * metre) / acsub - 1);
//            int aVelocity = 30;
//            if (start % 32 == 0) {
//                aVelocity = 50;
//            }
//            accompaniment2[i] = new Note(start * acsub, random(start, (32 * metre) / acsub) * acsub, notes2[i], aVelocity);
//        }
    
        for (int tonic = 60; tonic < 62; tonic++) { //Used to modulate half way though the piece
            for (int l = 0; l < 2; l++) { //Play each chord twice
                for (int i = 0; i < chords.length; i++) { // for each chord/bar

                    int[] notes = new int[6]; //Array holding note number of 2 8ves of chord
                    for (int j = 0; j < 2; j++) {
                        for (int k = 0; k < 3; k++) {
                            notes[k + j * 3] = k * 2 + j * 7 + chords[i];
                        }
                    }
                    
                    //Melody
                    int pos = 0;

                    int note;
                    if (barStart == 0) {
                        note = notes[random(0, 1) * 3];
                    } else {
                        note = notes[random(0, 5)];
                    }
                    melody.add(createNoteOnEvent(scaleNote(tonic, note, major) + 12, barStart + pos, velocity));
                    pos = random(1, 4) * 32;
                    melody.add(createNoteOffEvent(scaleNote(tonic, note, major) + 12, barStart + pos));

                    while (pos < metre * 32) {
                        int subDivision = (int) Math.pow(2, random(0, 2));
                        for (int k = 0; k < subDivision; k++) {
                            if (pos % 32 == 0) {
                                note = closest(note, notes);
                            } else if (random(0, 1) == 0) {
                                note++;
                            } else {
                                note--;
                            }
                            melody.add(createNoteOnEvent(scaleNote(tonic, note, major) + 12, barStart + pos, velocity));
                            pos += 32 / subDivision;
                            melody.add(createNoteOffEvent(scaleNote(tonic, note, major) + 12, barStart + pos));
                        }
                    }

                    //Accompaniment
//                    int time = barStart;
//                    for (int k = 0; k < metre; k++) {
//                        for (int j = 1; j < 3; j++) {
//                            accompaniment.add(createNoteOnEvent(scaleNote(n, notes[j], major), time, velocity));
//                            accompaniment.add(createNoteOffEvent(scaleNote(n, notes[j], major), time + 32));
//                        }
//                        time += 16;
//                        accompaniment.add(createNoteOnEvent(scaleNote(n, notes[0], major), time, velocity));
//                        accompaniment.add(createNoteOffEvent(scaleNote(n, notes[0], major), time + 16));
//                        time += 16;
//                    }
//                    barStart += 32 * metre;
//                    for (int k = 0; k < metre; k++) {
//                        for (int j = 0; j < accompaniment2.length; j++) {
//                            accompaniment.add(createNoteOnEvent(scaleNote(n, accompaniment2[j].getPitch() + chords[i], major), accompaniment2[j].getStart() + barStart, accompaniment2[j].getVelocity()));
//                            accompaniment.add(createNoteOffEvent(scaleNote(n, accompaniment2[j].getPitch() + chords[i], major), accompaniment2[j].getEnd() + barStart));
//                        }
//                    }
                    for (int k = 0; k < metre; k++) {
                        for (int j = 0; j < accompaniment3.size(); j++) {
                            accompaniment.add(createNoteOnEvent(scaleNote(tonic, accompaniment3.get(j).getPitch() + chords[i], major), accompaniment3.get(j).getStart() + barStart, accompaniment3.get(j).getVelocity()));
                            accompaniment.add(createNoteOffEvent(scaleNote(tonic, accompaniment3.get(j).getPitch() + chords[i], major), accompaniment3.get(j).getEnd() + barStart));
                        }
                    }
                    barStart += 32 * metre;
                }
            }
        }

        System.out.println("Length: " + sequence.getTickLength());

        playButton.setEnabled(true);
        saveButton.setEnabled(true);
        jSlider1.setEnabled(true);
    }//GEN-LAST:event_generateButtonActionPerformed

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        try {
            sequencer.setTickPosition(0);
            sequencer.setSequence(sequence);
            sequencer.start();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_playButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        JFileChooser saveFile = new JFileChooser();
        if (saveFile.showSaveDialog(saveFile) == JFileChooser.APPROVE_OPTION) {
            try {
                MidiSystem.write(sequence, MidiSystem.getMidiFileTypes(sequence)[0], saveFile.getSelectedFile());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
        jLabel1.setText(jSlider1.getValue() + "bpm");
        sequencer.setTempoFactor((float) jSlider1.getValue() / 60);
        melody.remove(tempoEvent);
        accompaniment.remove(tempoEvent);
        tempoEvent = createTempoEvent(jSlider1.getValue(), 0);
        melody.add(tempoEvent);
        accompaniment.add(tempoEvent);
    }//GEN-LAST:event_jSlider1StateChanged

    private static MidiEvent createNoteEvent(int nCommand, int nKey, int nVelocity, long lTick) {
        ShortMessage message = new ShortMessage();
        try {
            message.setMessage(nCommand, 0, nKey, nVelocity);
        } catch (InvalidMidiDataException ex) {
            ex.printStackTrace();
            System.exit(1);
        }
        MidiEvent event = new MidiEvent(message, lTick);
        return event;
    }

    private static MidiEvent createNoteOnEvent(int nKey, long lTick, int velocity) {
        return createNoteEvent(ShortMessage.NOTE_ON, nKey, velocity, lTick);
    }

    private static MidiEvent createNoteOffEvent(int nKey, long lTick) {
        return createNoteEvent(ShortMessage.NOTE_OFF, nKey, 0, lTick);
    }

    private static MidiEvent createTempoEvent(int bpm, long lTick) {
        //int mpq = ((60000000/ bpm) * 32);
        int mpq = 16000000 / bpm * 60;
        byte[] data = new byte[3];
        data[0] = (byte) ((mpq >> 16) & 0xFF);
        data[1] = (byte) ((mpq >> 8) & 0xFF);
        data[2] = (byte) (mpq & 0xFF);
        MetaMessage message = new MetaMessage();
        try {
            message.setMessage(0x51, data, data.length);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        MidiEvent event = new MidiEvent(message, lTick);
        return event;
    }

    private static int scaleNote(int tonic, int note, boolean major) {
        if (major) {
            return majorPitch(tonic, note);
        } else {
            return minorPitch(tonic, note);
        }
    }

    private static int majorPitch(int tonic, int note) {
        //System.out.println((note % 7) + "");
        //System.out.println((note / 7) + "");
        if (note % 7 > -1) {
            switch (note % 7) {
                case 0:
                    return tonic + (note / 7) * 12;
                case 1:
                    return tonic + (note / 7) * 12 + 2;
                case 2:
                    return tonic + (note / 7) * 12 + 4;
                case 3:
                    return tonic + (note / 7) * 12 + 5;
                case 4:
                    return tonic + (note / 7) * 12 + 7;
                case 5:
                    return tonic + (note / 7) * 12 + 9;
                case 6:
                    return tonic + (note / 7) * 12 + 11;
            }
        } else {
            switch (note % 7) {
                case -6:
                    return tonic + (note / 7) * 12 - 10;
                case -5:
                    return tonic + (note / 7) * 12 - 8;
                case -4:
                    return tonic + (note / 7) * 12 - 7;
                case -3:
                    return tonic + (note / 7) * 12 - 5;
                case -2:
                    return tonic + (note / 7) * 12 - 3;
                case -1:
                    return tonic + (note / 7) * 12 - 1;
            }
        }
        System.out.println("fail!" + note % 7);
        return 1;
    }

    private static int minorPitch(int tonic, int note) {
        System.out.println((note % 7) + "");
        System.out.println((note / 7) + "");
        if (note % 7 > -1) {
            switch (note % 7) {
                case 0:
                    return tonic + (note / 7) * 12;
                case 1:
                    return tonic + (note / 7) * 12 + 2;
                case 2:
                    return tonic + (note / 7) * 12 + 3;
                case 3:
                    return tonic + (note / 7) * 12 + 5;
                case 4:
                    return tonic + (note / 7) * 12 + 7;
                case 5:
                    return tonic + (note / 7) * 12 + 8;
                case 6:
                    return tonic + (note / 7) * 12 + 11;
            }
        } else {
            switch (note % 7) {
                case -6:
                    return tonic + (note / 7) * 12 - 10;
                case -5:
                    return tonic + (note / 7) * 12 - 9;
                case -4:
                    return tonic + (note / 7) * 12 - 7;
                case -3:
                    return tonic + (note / 7) * 12 - 5;
                case -2:
                    return tonic + (note / 7) * 12 - 4;
                case -1:
                    return tonic + (note / 7) * 12 - 1;
            }
        }
        System.out.println("fail!" + note % 7);
        return 1;
    }

    private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    private static int closest(int n, int[] array) {
        int[] distance = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            distance[i] = Math.abs(i - array[i]);
        }
        int min = Integer.MAX_VALUE;
        int x = 0;
        for (int i = 0; i < distance.length; i++) {
            if (distance[i] < min) {
                x = i;
                min = distance[i];
            }
        }
        return x;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfaceRandom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceRandom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceRandom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceRandom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceRandom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton generateButton;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton playButton;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}
