import React, { Component } from 'react';
import YouTube from 'react-youtube';
//https://youtu.be/k_2ZIGw8wN8
//https://www.youtube.com/watch?v=k_2ZIGw8wN8
class Youtube1 extends Component {
    //call back method

    render() {

        const opts = {
            height: "600",
            width: "1500",
            playerVars: {
                // https://developers.google.com/youtube/player_parameters
                autoplay: 1,
            },
        };
        // const {videoId} =this.props
        // eN2z16BKFZTB6rWn
        return <
            YouTube
            videoId="GwIo3gDZCVQ"
            //  {videoId}
            opts={opts}
            onReady={this.VideoOnReady} />;

    }
    VideoOnReady(event) {
        // access to player in all event handlers via event.target
        event.target.pauseVideo();
    }
}

export default Youtube1;
