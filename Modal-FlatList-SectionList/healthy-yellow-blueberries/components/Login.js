import { Text, SafeAreaView, StyleSheet,View,Image,ImageBackground,TextInput,Button,TouchableOpacity,Modal } from 'react-native';
import {useState} from 'react';

export default function Login(){

  const [username,setUsername]=useState("");
  const [modalVisible,setModalVisible]=useState(false);


   function buttonHandler(){
   setModalVisible(true);
  }

  return(
   <View style={styles.container1}>
   
      <ImageBackground style={{ flex:1,opacity:0.9 }} source={{
     uri: 'https://img.freepik.com/free-vector/wavy-minimal-lights-background_23-2148461189.jpg'
   }}>
   <Text style={styles.paragraph}>Login</Text>

   <TextInput style={styles.input}  onChangeText={newText => setUsername(newText)} placeholder="Enter User Name"/>

   <TextInput style={styles.input} placeholder="Enter Password"/>
  
   <TouchableOpacity style={styles.button} onPress={buttonHandler}>
      <Text>Login</Text>
   </TouchableOpacity>

      </ImageBackground>

      
      <Modal animationType="slide" transparent={true} visible={modalVisible} onRequestClose={() => {
          Alert.alert('Modal has been closed.');
          setModalVisible(!modalVisible);
        }} >
        <View style={styles.centeredView}>
        <View style={styles.modalContainer}>
            <Text style={styles.paragraph}> Welcome {username}</Text>
             <TouchableOpacity style={styles.button} onPress={() => {
          setModalVisible(false);
        }}>
      <Text>Close</Text>
   </TouchableOpacity>
        </View>
         </View>

      </Modal>
     

   </View>
  );
}
const styles = StyleSheet.create({

   container1: {
    flex: 4,
    justifyContent: 'center',
    backgroundColor: 'red',
  
  },
 
  paragraph: {
    margin: 24,
    fontSize: 18,
    fontWeight: 'bold',
    textAlign: 'center',
  },

  input:{
    height: 40,
    margin: 12,
    borderWidth: 1,
    borderRadius:10,
    padding: 10,
   backgroundColor:'white'
  },
  button:{
    borderRadius:20,
    borderWidth:2,
    height:30,
    width:65,
    justifyContent:'center',
   padding:10,
   backgroundColor:'orange',
   marginLeft:90

  },
  modalContainer:{
    height:200,
    width:200,
    borderRadius:15,
    alignItems:'center',
    justifyContent:'center',
    backgroundColor:'white',

  },
   centeredView: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    marginTop: 22,
  }
});