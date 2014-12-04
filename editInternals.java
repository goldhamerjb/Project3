 @FXML
    private void editSave(ActionEvent event) throws EmptyLinkedListException {
        //TODO
            String eInputName= ""+editInputName;
            String eInputID = ""+editInputID;
            String eInputGrade = ""+editInputGrade;
            String eAdvised = ""+editAdvised;
            String eAdviseDate = ""+editAdviseDate;
           if(studenID.equals(eInputID))
            {
                stulist.ChangeData.(eInputName, eInputID, eInputGrade, eAdvised, eAdviseDate )
            }
           else
           {
           if(stulist.contains(eInputID))    
           {
           //todo, throw up text box if edited user Id already exists
           }
           else{
           stulist.remove(studenID);
           stulist.addFull(eInputName, eInputID, eInputGrade, eAdvised, eAdviseDate);
           }}
    }

    @FXML
    private void editGetData(ActionEvent event) {
        //TODO 
        String fullList = stulist.getInfo(studenID);
        Scanner parser = new Scanner(fullList);
        parser.useDelimiter("&");
	editInputName.setText(parser.next());
	editInputID.setText(parser.next());
        switch (parser.next()) {
             case "Freshman":
             editInputGrade.getSelectionModel().select(0);
             break;             
             case "Sophomore":
             editInputGrade.getSelectionModel().select(1);
             break;             
             case "Junior":
             editInputGrade.getSelectionModel().select(2);
             break;             
             case "Senior":
             editInputGrade.getSelectionModel().select(3);
             break;
        }
        if (parser.next().equals("1")){
            editAdvised.setSelected(true);
        }
        else { editAdvised.setSelected(false); }
	editAdviseDate.setText(parser.next()); 
    }
    
