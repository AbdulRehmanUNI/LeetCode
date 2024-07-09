import { Text, SafeAreaView, StyleSheet,View,Image,ImageBackground,TextInput,Button } from 'react-native';

export default function Header(){
  return(
    <View style={styles.header}>
    <View style={{flex:1,flexDirection: 'row'}}>
    
     <Image
        style={styles.tinyLogo}
        source={{
          uri: 'https://reactnative.dev/img/tiny_logo.png',
        }}
      />
      <Text style={styles.paragraph1}>My App </Text>
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
  paragraph1: {
    flex:4,
    margin: 24,
    fontSize: 20,
    fontWeight: 'bold',
    textAlign: 'center',
  },
   tinyLogo: {
    flex:2,
    width: 0,
    height: 70,
    alignSelf:'center',
    marginLeft: 5
  },
 
});
