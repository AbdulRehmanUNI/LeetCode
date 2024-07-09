import { Text, SafeAreaView, StyleSheet,View,Image,ImageBackground,TextInput,Button } from 'react-native';

export default function Footer(){
  return(
     <View style={styles.footer}>
    <Text style={styles.paragraph}>Footer... </Text>
   </View>
  );
}
const styles = StyleSheet.create({
 
   footer: {
    flex: 1,
    justifyContent: 'center',
    backgroundColor: 'gray',
   
  },
  paragraph: {
    margin: 24,
    fontSize: 18,
    fontWeight: 'bold',
    textAlign: 'center',
  },
 
});