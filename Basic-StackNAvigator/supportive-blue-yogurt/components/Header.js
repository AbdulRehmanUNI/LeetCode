import { Text, SafeAreaView, StyleSheet,View,Image,ImageBackground,TextInput,Button,TouchableOpacity } from 'react-native';


export default function Header(){
  return(
     <View style={styles.header}>
        <View style={{flex:1,flexDirection:'row'}}>
          <Image style={styles.logo} source={{
           uri:'https://reactnative.dev/img/tiny_logo.png'
           }
           }/>
          <Text style={styles.paragraph}>MyApp</Text>
        </View>
      </View>
  );
}

const styles = StyleSheet.create({
 
  header: {
    flex: 1,
    justifyContent: 'center',
    backgroundColor: 'gray',
   
  },
  logo:{
    height:50,
    width:50,
    marginTop:10
    
  },

  paragraph: {
    margin: 24,
    fontSize: 18,
    fontWeight: 'bold',
    textAlign: 'center',
  },
 
});
