import { Text, SafeAreaView, StyleSheet,View,Image,ImageBackground,TextInput,Button } from 'react-native';
import Header from './components/Header'
import Login from './components/Login'
import Footer from './components/Footer'

// You can import supported modules from npm
import { Card } from 'react-native-paper';

// or any files within the Snack
import AssetExample from './components/AssetExample';

export default function App() {
 
  return (
   <View style={styles.container}>
   
   <Header/>
   <Login/> 
   <Footer/> 
   
   </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    backgroundColor: '#ecf0f1',
   
  }
});
