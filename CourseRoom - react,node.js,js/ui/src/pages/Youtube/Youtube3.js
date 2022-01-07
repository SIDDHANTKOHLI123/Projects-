import React, { Component } from 'react';
import YouTube from 'react-youtube';
//https://youtu.be/k_2ZIGw8wN8
//https://www.youtube.com/watch?v=k_2ZIGw8wN8
class Youtube3 extends Component {
    //call back method
    VideoOnReady(event) {
        // access to player in all event handlers via event.target
        event.target.pauseVideo();
    }
    render() {
        const opts = {
            height: '600',
            width: '1500',
            playerVars: {
                // https://developers.google.com/youtube/player_parameters
                autoplay: 1,
            },
        };
        // const {videoId} =this.props
        // eN2z16BKFZTB6rWn
        return <YouTube
         videoId="U_P23SqJaDc"
        //  {videoId}
            opts={opts}
            onReady={this.VideoOnReady} />;
    }


}

export default Youtube3;
