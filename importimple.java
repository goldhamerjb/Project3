ImportStudentInfo ImpStudent = new ImportStudentInfo();
ImpStudent.importFullInfo(stuList);

 private void addSave(ActionEvent event) {
        if (file == null) {   //
            System.out.println(radioButtons.getSelectedToggle().getUserData().toString());
        }
        
        else (true){
            ImpStudent.importBasicInfo(file, stuList)
        }
        
        
        
        //if inputselected and not empty
        //else if keyboard selected and not empty
        //else "nothing entered!"
        //TODO pass to theo's stuff
    }
