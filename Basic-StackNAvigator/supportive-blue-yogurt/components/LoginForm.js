import { Text, SafeAreaView, StyleSheet,View,Image,ImageBackground,TextInput,Button,TouchableOpacity,Modal } from 'react-native';
import { NavigationContainer } from '@react-navigation/native';
import { createNativeStackNavigator } from '@react-navigation/native-stack';

import React, {useState} from 'react';


export default function LoginForm({navigation}){
  const [modalVisible,setmodalVisible] = useState(false);
  const [username,setUsername]= useState('');
    function buttonHandler(){
    //setmodalVisible(true);
    navigation.navigate('List');
  }
  return(
    <View style={styles.content}>
        <ImageBackground style={{flex:1,opacity:0.9, justifyContent: 'center',alignItems:'center'}} source={ {
          uri : 'https://img.freepik.com/premium-photo/3d-abstract-background-with-smoke-colorful-splashes_566246-31118.jpg'
        }}>

        <Modal
        animationType="slide"
        transparent={true}
        visible={modalVisible}
        >

        <View style={styles.modalContainer}>
          <View style={styles.modalBody}>
           <Text style={styles.paragraph1}>Welcome {username}</Text>
           <Button title="Close" onPress={()=>setmodalVisible(false)} />
          </View>
        </View>

       

        </Modal>

      
        <Text style={styles.paragraph1}>Login</Text>
        <TextInput style={styles.input} onChangeText={(text)=> setUsername(text)} placeholder="Enter Username" />
        <TextInput style={styles.input} placeholder="Enter Password" />
     
        <TouchableOpacity style={styles.buttn} onPress={buttonHandler}>
              <Text>Login</Text>
        </TouchableOpacity>
        
        </ImageBackground>
      </View>
  );
}

const styles = StyleSheet.create({
 
  content: {
    flex: 4,
    justifyContent: 'center',
    backgroundColor: 'orange',
   
  },
  
  paragraph1: {
    margin: 24,
    fontSize: 18,
    fontWeight: 'bold',
    textAlign: 'center',
    opacity:1,
  
  },
  
  input: {
    height: 40,
    margin: 12,
    borderWidth: 1,
    padding: 10,
    backgroundColor:'white'
    
  },
  buttn: {
      backgroundColor:'white',
      justifyContent: 'center',
      alignItems:'center',
      height:30,
      width: 90,
      borderRadius:15,
  },
  modalContainer:{
    flex:1,
    justifyContent:'center',
    alignItems:'center',

  },
  modalBody:{
    height:150,
    width:150,
    backgroundColor:'white',
    borderRadius:15,
  }

});
