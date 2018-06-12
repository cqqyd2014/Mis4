/**
 * 
 */
const path=require('path');
const HtmlWebpackPlugin=require('html-webpack-plugin');
const CleanWebpackPlugin=require('clean-webpack-plugin');
const webpack=require('webpack');

module.exports ={
    entry:{
        
        app:'./src/index.js'
       
       
        
    },
    
 
    plugins:[
        new CleanWebpackPlugin(['dist']),
        new HtmlWebpackPlugin({
            title:'Production'
        }),
        new webpack.ProvidePlugin({
            _:'lodash'
        })
       
    ],
    optimization: {
        splitChunks: {
           name: 'manifest'
        }
    },
    output:{
        filename:'[name].bundle.js',
        chunkFilename:'[name].bundle.js',
        path:path.resolve(__dirname,'dist')
    }
};